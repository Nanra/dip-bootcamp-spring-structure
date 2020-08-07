package com.example.training.viewmodels;

import com.example.training.models.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeAddress {

    public Employee dataEmployee;
    public String area;
    public String houseColor;
    public Integer totalCar;

}
