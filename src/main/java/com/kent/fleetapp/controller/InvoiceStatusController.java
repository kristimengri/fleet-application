package com.kent.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

    @GetMapping("/invoicesStatus")
    public String getInvoicesStatus(){
        return "invoiceStatus";
    }
}
