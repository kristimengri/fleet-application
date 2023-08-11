package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {

    @GetMapping("/vehiclesStatus")
    public String getVehiclesStatus(){
        return "vehicleStatus";
    }
}
