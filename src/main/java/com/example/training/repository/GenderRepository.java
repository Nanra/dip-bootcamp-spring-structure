package com.example.training.repository;

import com.example.training.models.Gender;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenderRepository {

    public List<Gender> findAllGender(){

        Gender gender = new Gender();

        gender.setId("01");
        gender.setCode("M");
        gender.setName("Male");

        List<Gender> returnValue = (List<Gender>) gender;

        return returnValue;
    }

}
