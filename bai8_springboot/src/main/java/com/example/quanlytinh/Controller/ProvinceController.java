package com.example.quanlytinh.Controller;

import com.example.quanlytinh.model.Customer;
import com.example.quanlytinh.model.Province;
import com.example.quanlytinh.service.Imp.CustomerServiceImp;
import com.example.quanlytinh.service.Imp.ProvinceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
   ProvinceServiceImp provinceServiceImp;
    @Autowired
    private CustomerServiceImp customerServiceImp;


    @GetMapping("/view")
    public String listProvince(Model model){
        model.addAttribute("province",provinceServiceImp.findAll());
        return "/quanlykhachtinh/provinceview";
    }

    @GetMapping("/create")
    public String createProvince(Model model){
        model.addAttribute("province",new Province());
        return "/quanlykhachtinh/provincecreate";
    }

    @PostMapping("/create")
    public String createpost(@ModelAttribute Province province){
        provinceServiceImp.save(province);
        return "redirect:/province/view";
    }

    @GetMapping("/delete/{id}")
   public String delete(@PathVariable int id){
        provinceServiceImp.remove(id);
        return "redirect:/province/view";
    }
    @GetMapping("/viewprovince/{id}")
    public String viewProvince(@PathVariable("id") int id,Model model){
        Province province = provinceServiceImp.findById(id);
        if(province == null){
            return "redirect:/province/view";
        }else { List<Customer> customers = customerServiceImp.findAllByProvinceContains(province);
            model.addAttribute("customer",customers);
            model.addAttribute("province",province);
            return "/quanlykhachtinh/customertoprovince";}

    }

}