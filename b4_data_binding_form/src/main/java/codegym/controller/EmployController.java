package codegym.controller;

import codegym.model.formdatabiding.Employment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployController {
    @GetMapping("employment")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employment());
        return "/employmentcreate";
    }

    @PostMapping("employmentpost")
    public String submit(@ModelAttribute() Employment employee, Model model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "/employmentinfo";
    }
}
