package com.example.demo.AcseptQuanLyKhachHang.service.impl;

import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import com.example.demo.AcseptQuanLyKhachHang.repository.ProvinceRepository;
import com.example.demo.AcseptQuanLyKhachHang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
@Service
public class ProvinceServiceImplWithSpringData implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Page<Province> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
