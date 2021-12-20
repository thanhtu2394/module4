package codegym.Controller;

import codegym.model.Blog;
import codegym.service.Imp.BlogServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogServiceImp blogServiceImp;
    @GetMapping("create")
    public String displayCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "BlogCreate";
    }

    @PostMapping("create1")
    public String create(@ModelAttribute("blog") Blog blog, Model model) {
        blogServiceImp.save(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("list")
    public String listBlog(Model model) {
        model.addAttribute("blog", blogServiceImp.getList());
        return "BlogList";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id){
        blogServiceImp.deleteBlogById(id);
        return "redirect:/list";

    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") int id,Model model){
        Blog blog=blogServiceImp.getBlogById(id);
        model.addAttribute("blog",blog);
        return "BlogEdit";
    }
    @PostMapping("edit/{id}")
    public String editpost(@ModelAttribute Blog blog,Model model){
        blogServiceImp.save(blog);
        return "redirect:/list";
    }

}
