package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

    @GetMapping("vehiclesMake")
    public String getVehiclesMake(){
        return "vehicleMake";
    }
}
