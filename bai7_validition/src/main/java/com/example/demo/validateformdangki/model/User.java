package com.example.demo.validateformdangki.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
public class User {
    @Size(min=5,max=45,message = "loi")
    private String firstname;
    @Size(min=5,max=45,message = "loi")
    private String lastname;
    private String phone;

    @Email(message = "{formdk.email}")
    private String email;

    @Min(value = 18, message = "{formdk.age}")
    private int age;

    public User() {
    }

    public User(@Size(min = 5, max = 45) String firstname, @Size(min = 5, max = 45) String lastname, String phone, @Email(message = "formdk.email") String email, @Min(value = 18, message = "formdk.age") int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
