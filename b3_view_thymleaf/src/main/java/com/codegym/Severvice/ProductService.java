package com.codegym.Severvice;

import com.codegym.model.Product;
import com.codegym.model.customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> findAll();

}
