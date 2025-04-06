package com.zaurtregulov_spring.springboot.springboot_rest.controller;


import com.zaurtregulov_spring.springboot.springboot_rest.entity.Employee;
import com.zaurtregulov_spring.springboot.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    @Transactional
    public List<Employee> showAllEmployees() {
        List<Employee> AllEmployees = employeeService.getAllEmployees();
        return AllEmployees;
    }

//    @GetMapping("/employees/{id}")
//    @Transactional
//    public Employee getEmployees(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//
//        employeeService.deleteEmployee(id);
//        return "Employee with ID = " + id + " was deleted";
//    }
}
