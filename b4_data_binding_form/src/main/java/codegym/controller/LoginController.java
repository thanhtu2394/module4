package codegym.controller;

import codegym.model.Login.Login;
import codegym.model.Login.User;
import codegym.service.Login.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    LoginServiceImp loginServiceImp=new LoginServiceImp();
    @GetMapping("/login")
    public String Login(Model model){
        model.addAttribute("login",new Login());
        return "login";

    }
    @PostMapping("/login1")
   public String Login1(@ModelAttribute()Login login,Model model){
        User user=loginServiceImp.Comperatrue(login);
        model.addAttribute("user",user);
return "loginview";
    }
}
