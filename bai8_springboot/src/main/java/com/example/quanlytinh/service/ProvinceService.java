package com.example.quanlytinh.service;

import com.example.quanlytinh.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProvinceService {
    List<Province> findAll();
    Page<Province> findall(Pageable pageable);
    Province findById(int id);

    void save(Province province);

    void remove(int id);
}
