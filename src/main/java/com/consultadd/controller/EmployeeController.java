package com.consultadd.controller;


import com.consultadd.Service.EmployeeService;
import com.consultadd.model.Employee;
import com.consultadd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
      return employeeService.getEmployee();
    }

    @PostMapping("/addemp")
    public String saveEmployee(@RequestBody Employee employee){
         return employeeService.saveEmployees(employee);
    }

    @PutMapping("/updateemp")
    public String updateEmployee(@PathVariable String id,@Validated @RequestBody Employee employee){
        return employeeService.UpdateEmployees(employee);
    }


}

