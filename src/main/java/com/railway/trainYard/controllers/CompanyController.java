package com.railway.trainYard.controllers;

import com.railway.trainYard.domainModel.Company;
import com.railway.trainYard.services.TrainyardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/company")
public class CompanyController {

    private final TrainyardService trainyardService;

    @Autowired
    public CompanyController(TrainyardService trainyardService){
        this.trainyardService = trainyardService;
    }

    @GetMapping
    public List<Company> listCompanies(){
        return trainyardService.getCompanies();
    }
}
