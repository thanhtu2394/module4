package codegym.controller;

import codegym.model.cauhinh.CauHinh;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CauHinhController {
    @GetMapping("cauhinh")
    public String view(Model model){
        String[] a=new String[]{"englist","vietnam","lao","usa"};
        model.addAttribute("Cauhinh",new CauHinh("English","5","ennable","disable"));
       model.addAttribute("languge",new String[]{"englist","vietnam","lao","usa"} );
       model.addAttribute("size",new String[]{"5","10","15","20","25"} );
        return "cauhinhupdate";
    }
    @PostMapping("cauhinhpost")
    public String update(@ModelAttribute() CauHinh Cauhinh,Model model){
        model.addAttribute("Cauhinh",Cauhinh);
        return "cauhinhview";
    }
}
