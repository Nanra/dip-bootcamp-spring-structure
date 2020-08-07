package com.example.training.services;

import com.example.training.models.Employee;
import com.example.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getListEmployee(){
        return repository.findAllEmployee();
    }

    public Integer saveNewEmployee(Employee dataForSave){

        // Operation Example
        String nameUppercase = dataForSave.getName().toUpperCase();
        dataForSave.setName(nameUppercase);

        return repository.insertEmployee(dataForSave);
    }

    public Integer deleteEmployeeById(String idEmployee){
        return repository.deleteEmployeeById(idEmployee);
    }

    public List<Employee> getEmployee(String idEmployee){
        return repository.findEmployeeById(idEmployee);
    }

}
