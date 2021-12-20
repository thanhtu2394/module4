package com.example.demo.AcseptQuanLyKhachHang.controller;

import com.example.demo.AcseptQuanLyKhachHang.model.Customer;
import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import com.example.demo.AcseptQuanLyKhachHang.service.CustomerService;
import com.example.demo.AcseptQuanLyKhachHang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/customer"})
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public String listCustomers(Model model, @PageableDefault(size = 3) Pageable pageable,
                                Optional<String> key_search,
                                Optional<String> sort){
        Sort orders = null;
        if(sort.isPresent()) {
            if (sort.get().equals("ASC")) {
                orders = Sort.by("last_name").ascending();
            } else if (sort.get().equals("DESC")) {
                orders = Sort.by("last_name").descending();
            }
        }
        if(key_search.isPresent()){
            model.addAttribute("listCustomer",customerService.findAllByLastName(key_search.get(),pageable));
        } else {
            model.addAttribute("listCustomer", customerService.findAll(pageable));
        }
        return "customer/view";
    }

    @ModelAttribute("provinces")
    public List<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/create")
    public ModelAndView createCustomer(){
        return new ModelAndView("customer/create","customer",new Customer());
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message","Thêm thành công");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editCustomer(@PathVariable("id") Long id){
        try {
            return new ModelAndView("customer/edit","customer",customerService.findById(id));
        } catch (Exception exception) {
            return new ModelAndView("redirect:/customer/");
        }
    }

    @PostMapping("/edit")
    public ModelAndView editCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message","Sủa thành công");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable("id") Long id){
        try {
            return new ModelAndView("customer/delete","customer",customerService.findById(id));
        } catch (Exception exception) {
            return new ModelAndView("redirect:/customer/");
        }
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/customer/";
    }
}