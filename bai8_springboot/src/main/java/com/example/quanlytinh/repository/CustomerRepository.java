package com.example.quanlytinh.repository;

import com.example.quanlytinh.model.Customer;
import com.example.quanlytinh.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    List<Customer> findAllByProvinceContains(Province province);
}
