package codegym.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class btmaytinh {
    @GetMapping("/maytinh")
    public String maytinh(){
        return  "Btmaytinh";
    }
    @PostMapping("/maytinh1")
    public String maytinh1(@RequestParam()String num1, @RequestParam()String num2, @RequestParam()String dau, Model model){
        int numone=Integer.parseInt(num1);
        int numtwo=Integer.parseInt(num2);
        int total;
        String dau1=dau;
        switch (dau1){
            case "1" :
                total=numone+numtwo;
                break;
            case "2":
                total=numone-numtwo;
                break;
            case "3":
                total=numone*numtwo;
                break;
            case "4":
                total=numone/numtwo;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dau1);
        }
        model.addAttribute("total",total);
        return "Btmaytinh";
    }
}
