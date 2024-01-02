package com.anil.employeeservice.controller;

import com.anil.employeeservice.model.Employee;
import com.anil.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    private static final Logger logger = LoggerFactory
            .getLogger(EmployeeController.class);

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
        logger.info("Employee add : {}",employee);
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        logger.info("Department find");
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        logger.info("Employee find : id={}",id);
        return employeeRepository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){
        logger.info("Employee find : {}",departmentId);
        return employeeRepository.findByDepartment(departmentId);
    }

}
