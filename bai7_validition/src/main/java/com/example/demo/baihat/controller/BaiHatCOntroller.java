package com.example.demo.baihat.controller;

import com.example.demo.baihat.model.BaiHat;
import com.example.demo.validaaforminput.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BaiHatCOntroller {
    @GetMapping("/baihat")
    public String showForm(Model model) {
        model.addAttribute("baihat",new BaiHat());
        return "/baihat/view";}
    @PostMapping("/baihat")
    public String checkValidation(@Validated @ModelAttribute("baihat") BaiHat baihat, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("baihat",baihat);
            return "/baihat/view";
        }else {
            return "/baihat/result";
        }
    }
}
