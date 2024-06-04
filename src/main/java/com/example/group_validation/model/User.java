package com.example.group_validation.model;

import com.example.group_validation.groups.AdditionalInfoValidation;
import com.example.group_validation.groups.BasicInfoValidation;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank(message = "username is required", groups = BasicInfoValidation.class)
    private String username;
    @NotBlank(message = "password is required", groups = BasicInfoValidation.class)
    private String password;
    @NotBlank(message = "email is required", groups = AdditionalInfoValidation.class)
    private String email;
    @NotBlank(message = "age is required", groups = AdditionalInfoValidation.class)
    private String age;

}
