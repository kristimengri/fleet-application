package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {

    @GetMapping("/vehiclesHire")
    public String getVehiclesHire(){
        return "vehicleHire";
    }
}
