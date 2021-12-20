package com.example.quanlytinh.repository;

import com.example.quanlytinh.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvicePagingRepository extends PagingAndSortingRepository<Province,Integer> {

}
