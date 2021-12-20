package com.example.demo.AcseptQuanLyKhachHang.repository;

import com.example.demo.AcseptQuanLyKhachHang.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
