package com.example.quanlytinh.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int province_id;

    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    List<Customer> customers;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public int getId() {
        return province_id;
    }

    public void setId(int id) {
        this.province_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
