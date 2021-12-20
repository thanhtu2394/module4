package com.codegym.Severvice;

import com.codegym.model.customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<customer> findAll();

    void save(customer customer);

    customer findById(int id);

    void update(int id, customer customer);

    void remove(int id);
}
