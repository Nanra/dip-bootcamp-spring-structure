package com.example.training.controllers;

import com.example.training.models.Employee;
import com.example.training.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/list")
    public ResponseEntity<?> listEmployee(){

        List<Employee> responseBody = employeeService.getListEmployee();

        return ResponseEntity.ok(responseBody);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveEmployee(){
        return ResponseEntity.ok("This is Page Save Employee");
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<?> deleteEmployee(){
        return ResponseEntity.ok("This is Page Delete Employee");
    }

    @PostMapping(value = "/update")
    public ResponseEntity<?> updateEmployee(){
        return ResponseEntity.ok("This is Page Update Employee");
    }

}
