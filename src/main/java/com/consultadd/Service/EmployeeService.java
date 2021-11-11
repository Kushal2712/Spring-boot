package com.consultadd.Service;

import com.consultadd.model.Employee;
import com.consultadd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public String saveEmployees(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            return "Data exist already";
        } else {
            employeeRepository.save(employee);
            return "Saved succesfully";
        }
    }

    public String updateEmployee(Employee employee) {
        if (!employeeRepository.existsById(employee.getId())) {
            return "Couldn't update data. Id doesn't exists.";
        } else {
            employeeRepository.save(employee);
            return "Employee data saved successfully.";
        }
    }

    public String deleteEmployee(Employee employee) {
        if (!employeeRepository.existsById(employee.getId())) {
            return "Couldn't Delete Data. Id doesn't exists.";
        } else {
            employeeRepository.delete(employee);
            return "Employee data deleted successfully.";
        }
    }
public List<Employee> findAllByCity(String city){
        return employeeRepository.findAllByCity(city);
}



}
