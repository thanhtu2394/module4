package com.example.quanlytinh.service.Imp;

import com.example.quanlytinh.model.Province;
import com.example.quanlytinh.repository.ProvicePagingRepository;
import com.example.quanlytinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceServiceImp implements ProvinceService {
    @Autowired
    ProvicePagingRepository provicePagingRepository;
    @Override
    public List<Province> findAll() {
        return (List<Province>) provicePagingRepository.findAll();
    }

    @Override
    public Page<Province> findall(Pageable pageable) {
        return provicePagingRepository.findAll(pageable);
    }

    @Override
    public Province findById(int id) {
        return provicePagingRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
provicePagingRepository.save(province);
    }

    @Override
    public void remove(int id) {
        provicePagingRepository.deleteById(id);
    }
}
