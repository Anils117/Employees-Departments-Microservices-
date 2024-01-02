package com.anil.departmentservice.controller;

import com.anil.departmentservice.client.EmployeeClient;
import com.anil.departmentservice.model.Department;
import com.anil.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger logger = LoggerFactory
            .getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping()
    public Department addDepartment(@RequestBody Department department){
        logger.info("Department add : {}",department);
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        logger.info("Department find");
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id){
        logger.info("Department find : id={}",id);
        return departmentRepository.findById(id);
    }


    @GetMapping("/with-employees")
    public List<Department> findAllWithEmployees(){
        logger.info("Department find");
        List<Department> departments = departmentRepository.findAll();
        departments.forEach(
                department -> department
                        .setEmployees(employeeClient.findByDepartment(department.getId())));
        return departments;
    }

}
