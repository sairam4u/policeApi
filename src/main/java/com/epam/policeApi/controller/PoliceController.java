package com.epam.policeApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class PoliceController {

    @Autowired
    PoliceService service;

    @GetMapping(value = "/verifyVehicle/{regNumber}/{chassisNumber}")
    public ResponseEntity<TheftVehicles> verifyVehicle(@PathVariable(value = "regNumber") String regNumber, @PathVariable(value = "chassisNumber") String chassisNumber){
        Optional<TheftVehicles> vehicles = service.checkVehicle(regNumber);
        //vehicles.orElseThrow(new VehicleNotFoundException() )
        return new ResponseEntity<>(vehicles.get(), HttpStatus.OK);
    }


}
