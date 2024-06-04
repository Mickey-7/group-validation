package com.example.group_validation.controller;

import com.example.group_validation.groups.AdditionalInfoValidation;
import com.example.group_validation.groups.BasicInfoValidation;
import com.example.group_validation.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @PostMapping("/without-validation/user")
    public User postUserWithoutValidation(@RequestBody User user){
        System.out.println(user);
        return user;
    }

    @PostMapping("/with-basic-validation/user")
    public User postUserWithBasicValidation(@Validated(BasicInfoValidation.class) @RequestBody User user){
        System.out.println(user);
        return user;
    }

    @PostMapping("/with-additional-validation/user")
    public User postUserWithAdditionalValidation(@Validated(AdditionalInfoValidation.class) @RequestBody User user){
        System.out.println(user);
        return user;
    }

    @PostMapping("/with-complete-validation/user")
    public User postUserWithCompleteValidation(
            @Validated({AdditionalInfoValidation.class, BasicInfoValidation.class}) @RequestBody User user){
        System.out.println(user);
        return user;
    }
}
