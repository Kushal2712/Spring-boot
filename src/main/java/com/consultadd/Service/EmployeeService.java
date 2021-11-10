package com.consultadd.Service;

import java.util.*;
import com.consultadd.model.Employee;
import com.consultadd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

   public  List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public String saveEmployees(Employee employee){
        if(employeeRepository.existsById(employee.getId())){
            return "Data exist already";
        }else{
            employeeRepository.save(employee);
            return "Saved succesfully";
        }
    }

    public String UpdateEmployees(Employee employee){
       if(employeeRepository.existsById(employee.getId())){
           employee.setId(employee.getId());
           employee.setName(employee.getName());
           employee.setAge(employee.getAge());
           return "data updated succesfully";
       }else{
           saveEmployees(employee);
           return "data has been saved";

       }
    }
}
