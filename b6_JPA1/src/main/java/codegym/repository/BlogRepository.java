package codegym.repository;

import codegym.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BlogRepository extends CrudRepository<Blog,Integer> {
}
