package com.example.demo.AcseptQuanLyKhachHang.service;


import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProvinceService {
    List<Province> findAll();

    Page<Province> findAll(Pageable pageable);

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);

}