package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

    @GetMapping("/employeesType")
    public String getEmployeesType(){
        return "employeeType";
    }
}
