package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class btsanwich {
    @GetMapping("/sandwich")
    public String sandwich(@RequestParam(required = false) String[] name , Model model){
        model.addAttribute("btsandwich",name);
        return "/btsanwich";
    }
}
