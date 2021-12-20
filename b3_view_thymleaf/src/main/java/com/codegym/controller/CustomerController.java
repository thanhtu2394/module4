package com.codegym.controller;

import com.codegym.Severvice.CustomerServiceImp;
import com.codegym.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImp customerServiceImp = new CustomerServiceImp();

    @GetMapping("/customer")
    public String view(Model model) {
        List<customer> customerList = customerServiceImp.findAll();
        model.addAttribute("customerList", customerList);
        return "CusomerView";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam() String id, Model model, RedirectAttributes redirectAttributes) {
        int id1 = Integer.parseInt(id);
        customerServiceImp.remove(id1);
        redirectAttributes.addFlashAttribute("success", "Xoá thành công");
        return "redirect:/customer";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam() String id, Model model) {
        int id2 = Integer.parseInt(id);
        customer customer = customerServiceImp.findById(id2);
        model.addAttribute("customeredit", customer);
        return "EditCustomer";
    }

    @PostMapping("/editPost")
    public String edit(@ModelAttribute() customer customeredit) {
        customerServiceImp.update(customeredit.getId(), customeredit);
        return "redirect:/customer";
    }

    @GetMapping("/view")
    public String delete(@RequestParam() String id, Model model) {
        int id3 = Integer.parseInt(id);
        customer customer = customerServiceImp.findById(id3);
        List<customer> customerList1 = new ArrayList<customer>();
        customerList1.add(customer);
        model.addAttribute("customerList", customerList1);
        return "CusomerView";
    }
}
