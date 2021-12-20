package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class TuDienController {
@GetMapping("/tudien")
    public String traCuu(){
        return "tudien";
    }
    @PostMapping("tudien")
    public String tracuu1(@RequestParam String name, Model model){
        Map<String,String> map= new HashMap<>();
        map.put("one","một");
        map.put("tow","hai");
        map.put("there","ba");
        map.put("four","bốn");
        map.put("five","năm");
        for (String index:map.keySet()
             ) {
            if(index.equals(name)){
                String result=map.get(index);
                model.addAttribute("result",result);
                return "tudien";


        }{
                String error="ko co";
                model.addAttribute("result",error);
            }
        }
        return "tudien";
    }
}
