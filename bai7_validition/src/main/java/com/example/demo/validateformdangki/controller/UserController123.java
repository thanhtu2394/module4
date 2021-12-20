package com.example.demo.validateformdangki.controller;

import com.example.demo.validateformdangki.model.User;
import com.example.demo.validateformdangki.model.Uservalidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController123 {
    @Autowired
    Uservalidate uservalidate;

    @GetMapping("/userdk")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "/formdk/view";
    }

    @PostMapping("/userdk")
    public String checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        uservalidate.validate(user,bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "/formdk/view";
        }
        return "/formdk/result";
    }
}
