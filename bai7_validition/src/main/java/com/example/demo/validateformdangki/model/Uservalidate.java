package com.example.demo.validateformdangki.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class Uservalidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user=(User) target;
        if(!user.getPhone().startsWith("0")){
            errors.rejectValue("phone","number.startsWith");
        }
        if(user.getPhone().length()>11 || user.getPhone().length()<10){
            errors.rejectValue("phone","number.length");
        }
    }
}
