package codegym.service.Imp;

import codegym.model.Customer;
import codegym.repository.Imp.CustomerRepositoryImp;
import codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerRepositoryImp customerRepositoryImp;
    @Override
    public List<Customer> findAll() {

        return customerRepositoryImp.findAll();
    }

    @Override
    public Customer findById(Long id) {

        return customerRepositoryImp.findById(id);
    }

    @Override
    public void save(Customer customer) {

        customerRepositoryImp.save(customer);
    }

    @Override
    public void update(Customer customer) {

        customerRepositoryImp.update(customer);
    }

    @Override
    public void remove(Long id) {

        customerRepositoryImp.remove(id);
    }
}
