package com.railway.trainYard.controllers;

import com.railway.trainYard.domainModel.Locomotive;
import com.railway.trainYard.services.TrainyardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/trainyard")
public class TrainyardController {

    private final TrainyardService trainyardService;

    @Autowired
    public TrainyardController(TrainyardService trainyardService){
        this.trainyardService = trainyardService;
    }

    @GetMapping
    public List<Locomotive> listLocomotives(){
        return trainyardService.getLocomotives();
    }
}
