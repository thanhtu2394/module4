package com.codegym.controller;

import com.codegym.Severvice.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    ProductServiceImp productServiceImp=new ProductServiceImp();
    @GetMapping("/Product")
    public String ProductView(Model model){
        model.addAttribute("Product",productServiceImp.findAll());
        return "ProductView";
    }
}
