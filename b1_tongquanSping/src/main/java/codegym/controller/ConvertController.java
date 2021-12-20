package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String Convert(){
        return "convert";
    }

    @PostMapping("/convert")
    public String Convert(@RequestParam(value = "USD" ,required = false) String USD, Model model){
        int USD1=Integer.parseInt(USD)*23000;
        model.addAttribute("convert",USD1);
        return "convert";
    }
}
