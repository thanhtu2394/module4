package codegym.repository;

import codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);
    void update(Customer customer);
    void remove(Long id);
}
