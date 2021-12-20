package com.example.demo.AcseptQuanLyKhachHang.controller;

import com.example.demo.AcseptQuanLyKhachHang.model.Customer;
import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import com.example.demo.AcseptQuanLyKhachHang.service.CustomerService;
import com.example.demo.AcseptQuanLyKhachHang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public ModelAndView listProvince(){
        return new ModelAndView("province/index","listProvince",provinceService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView createProvince(){
        return new ModelAndView("province/create","province",new Province());
    }

    @PostMapping("/create")
    public ModelAndView createProvince(@ModelAttribute Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province",new Province());
        modelAndView.addObject("message","Thêm thành công!");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editProvince(@PathVariable("id") Long id){
        return new ModelAndView("province/edit","province",provinceService.findById(id));
    }

    @PostMapping("/edit")
    public ModelAndView editProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/edit");
        modelAndView.addObject("province",province);
        modelAndView.addObject("message","Sửa thành công!");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable("id") Long id){
        return new ModelAndView("province/delete","province",provinceService.findById(id));
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("province") Customer customer){
        provinceService.remove(customer.getId());
        return "redirect:/province/";
    }

    @GetMapping("/view-province/{id}")
    public ModelAndView viewProvince(@PathVariable("id") Long id){
        Province province = provinceService.findById(id);
        if(province==null){
            return null;
        }
        Iterable<Customer> customers = customerService.findAllByProvince(province);
        ModelAndView modelAndView = new ModelAndView("province/view");
        modelAndView.addObject("province",province);
        modelAndView.addObject("listCustomer",customers);
        return modelAndView;
    }
}
