package com.example.quanlytinh.service.Imp;

import com.example.quanlytinh.model.Customer;
import com.example.quanlytinh.model.Province;
import com.example.quanlytinh.repository.CustomerRepository;
import com.example.quanlytinh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
customerRepository.deleteById(id);
    }


    @Override
    public List<Customer> findAllByProvinceContains(Province province) {
        return customerRepository.findAllByProvinceContains(province);
    }
}
