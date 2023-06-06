package com.epam.policeApi.controller;

import com.epam.policeApi.repository.TheftVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PoliceService {

    @Autowired
    TheftVehicleRepository repo;
    Optional<TheftVehicles> checkVehicle(String regNumber){
       return repo.findById(regNumber);

    }
}
