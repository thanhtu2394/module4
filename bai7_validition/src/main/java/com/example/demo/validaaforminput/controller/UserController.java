package com.example.demo.validaaforminput.controller;

import com.example.demo.validaaforminput.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String showForm(Model model) {
       model.addAttribute("user",new User());
       return "/validataforminput/view";}
    @PostMapping("/validateUser")
    public String checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("user",user);
            return "/validataforminput/view";
        }else {
            return "/validataforminput/result";
        }
    }

}
