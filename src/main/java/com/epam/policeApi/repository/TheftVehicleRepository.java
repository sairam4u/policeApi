package com.epam.policeApi.repository;

import com.epam.policeApi.controller.TheftVehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TheftVehicleRepository extends JpaRepository<TheftVehicles, String> {

    @Override
    Optional<TheftVehicles> findById(String s);
}