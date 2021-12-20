package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show() {
        return "show";
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public String show1(@RequestParam() String name, Model model) {
        model.addAttribute("name",name);
        return "show";
    }
    @RequestMapping(value = "/show1",method = RequestMethod.GET)
    public ModelAndView modelAndView(@RequestParam(required = false) String name ){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("show");
        modelAndView.addObject("name",name);
return modelAndView;
    }
}
