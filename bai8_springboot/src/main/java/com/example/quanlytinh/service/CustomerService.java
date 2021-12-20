package com.example.quanlytinh.service;

import com.example.quanlytinh.model.Customer;
import com.example.quanlytinh.model.Province;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);

    List<Customer> findAllByProvinceContains(Province province);;
}
