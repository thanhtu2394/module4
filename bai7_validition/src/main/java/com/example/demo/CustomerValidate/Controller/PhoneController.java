package com.example.demo.CustomerValidate.Controller;

import com.example.demo.CustomerValidate.Model.PhoneNumber;
import com.example.demo.CustomerValidate.Model.PhoneValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @Autowired
    PhoneValidate phoneValidate;
    @GetMapping("/phone")
    public String showForm(Model model){
        model.addAttribute("phonemunber", new PhoneNumber());
        return "/phone/index";
    }
    @PostMapping("/phone")
    public String checkValidation (@Validated @ModelAttribute("phonemunber")PhoneNumber phonemunber, BindingResult bindingResult, Model model){
        phoneValidate.validate(phonemunber,bindingResult);
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("phonemunber", phonemunber);
            return "/phone/index";
        }
            model.addAttribute("phoneNumber", phonemunber.getNumber());
            return "/phone/result";
    }
}
