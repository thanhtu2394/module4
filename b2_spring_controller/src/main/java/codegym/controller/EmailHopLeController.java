package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailHopLeController {
    private static Pattern pattern;
    private Matcher matcher;

    /* Khai báo Regex */
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailHopLeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping("/")
    String getIndex() {
        return "thuchanhemail";
    }
    @PostMapping("/validate")
    String validateEmail(@RequestParam("email") String email, Model model) {
        boolean isvalid = this.validate(email);
        if (!isvalid) {
            model.addAttribute("message", "Email is invalid");
            return "thuchanhemail";
        }

        model.addAttribute("email", email);
        return "thuchanhemailsucsess";
    }
    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
