package codegym.service.Imp;

import codegym.model.Blog;
import codegym.repository.BlogRepository;
import codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public Blog getBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> getList() {
        Iterable<Blog> iterable=blogRepository.findAll();
        List<Blog> list=new ArrayList<>();
        for (Blog s:iterable
             ) {
            list.add(s);

        }
        return list;
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void update(Blog blog) {
blogRepository.save(blog);
    }

    @Override
    public void deleteBlogById(int id) {
        blogRepository.deleteById(id);
    }

}
