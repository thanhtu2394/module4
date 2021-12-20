package codegym.service;

import codegym.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService {
    Blog getBlogById(int id);
    List<Blog> getList();
    void save(Blog blog);
    void update(Blog blog);
    void deleteBlogById(int id);
}
