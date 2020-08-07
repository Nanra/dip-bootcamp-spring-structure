package com.example.training.repository;

import com.example.training.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> findAllEmployee(){

        // Instance & Set Value Object Payment
        Employee dataEmployee = new Employee();

        // Set Dummy Value Payment
        List<Employee> returnValue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataEmployee.setName("User " + i);
            dataEmployee.setId("UID " + i);
            dataEmployee.setPhone("Phone Numb "+i);
            dataEmployee.setEmail("mail sample"+i);
            dataEmployee.setAddress("City "+i);
            returnValue.add(i, dataEmployee);
        }

        return returnValue;
    }

    public List<Employee> findEmployeeById(String idEmployee){
        return null;
    }

    public Integer updateEmployee(Employee dataForSave){
        return null;
    }

    public Integer insertEmployee(Employee dataForSave){
        return null;
    }

    public Integer deleteEmployeeById(String idEmployee) {
        return null;
    }


}
