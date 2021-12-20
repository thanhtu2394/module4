package com.codegym.Severvice;

import com.codegym.model.customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerServiceImp implements CustomerService {
    private static Map<Integer, customer> customers;

    static {

        customers = new HashMap<>();
        customers.put(1, new customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }


    @Override
    public List<customer> findAll() {
        return  new ArrayList<customer>(customers.values());
    }

    @Override
    public void save(customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
