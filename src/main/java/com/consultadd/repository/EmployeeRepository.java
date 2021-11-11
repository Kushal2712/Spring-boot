package com.consultadd.repository;

import com.consultadd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    List<Employee> findAllByCity(String city);

}
