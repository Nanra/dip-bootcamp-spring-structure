package com.example.training.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    public String id;
    public String name;
    public String address;
    public String phone;
    public String email;

}