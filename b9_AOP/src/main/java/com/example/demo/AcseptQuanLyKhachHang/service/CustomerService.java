package com.example.demo.AcseptQuanLyKhachHang.service;

import com.example.demo.AcseptQuanLyKhachHang.model.Customer;
import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllException(Pageable pageable) throws Exception;

    Customer findById(Long id) throws Exception;

    void save(Customer customer);

    void remove(Long id);

    List<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByLastName(String lastName, Pageable p);

    Page<Customer> customQuery(String firstName, Pageable p);
}