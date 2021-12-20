package codegym.Controller;

import codegym.model.Customer;
import codegym.service.Imp.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    CustomerServiceImp customerServiceImp;
    @GetMapping("/findall")
    public String findall(Model model){
        List<Customer> list=customerServiceImp.findAll();
        model.addAttribute("Customerlist",list);
        return "CustomerView";
    }
    @GetMapping("/CreateView")
    public String CreateView(Model model){
        model.addAttribute("Customer",new Customer());
        return "CustomerCreate";
    }
    @PostMapping("/CreateResult")
    public String Create(@ModelAttribute Customer customer, Model model){
        customerServiceImp.save(customer);
        return "redirect:/findall";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
       customerServiceImp.remove(id);
       return "redirect:/findall";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id,Model model){
        Customer customer= customerServiceImp.findById(id);
        model.addAttribute("customer",customer);
        return "CustomerEdit";
    }
    @PostMapping("/editpost")
    public String editpost(@ModelAttribute Customer customer){
        customerServiceImp.update(customer);
        return "redirect:/findall";
    }

}
