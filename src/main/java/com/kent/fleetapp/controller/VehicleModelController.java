package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

    @GetMapping("/vehiclesModel")
    public String getVehiclesModel(){
        return "vehicleModel";
    }
}
