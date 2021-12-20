package com.example.quanlytinh.Controller;

import com.example.quanlytinh.model.Customer;
import com.example.quanlytinh.service.Imp.CustomerServiceImp;
import com.example.quanlytinh.service.Imp.ProvinceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"/customer"})
public class CustomerController {

        @Autowired
        private CustomerServiceImp customerServiceImp;

        @Autowired
        private ProvinceServiceImp provinceServiceImp;

        @GetMapping("/view")
        public String listProvince(Model model){
            model.addAttribute("customer",customerServiceImp.findAll());
            return "/quanlykhachtinh/customerview";
        }


    @GetMapping("/create")
    public String createCustomer(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("province",provinceServiceImp.findAll());
        return "/quanlykhachtinh/customercreate";
    }

    @GetMapping("/create")
    public String createpost(@ModelAttribute Customer customer){
        customerServiceImp.save(customer);
        return "redirect:/customer/view";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        customerServiceImp.remove(id);
        return "redirect:/customer/view";
    }
    }
