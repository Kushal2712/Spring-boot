package com.consultadd.controller;


import com.consultadd.Service.EmployeeService;
import com.consultadd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public String updateEmployee( @RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delemp")
    public String deleteEmployee(@RequestBody Employee employee){
        return employeeService.deleteEmployee(employee);
    }

    @GetMapping("/employee/{city}")
    public ResponseEntity findAllByCity (@PathVariable  String city){
        return ResponseEntity.ok(employeeService.findAllByCity(city));
    }

   

}

