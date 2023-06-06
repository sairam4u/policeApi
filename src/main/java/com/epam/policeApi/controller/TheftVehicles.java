package com.epam.policeApi.controller;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "theftvehicles")
public class TheftVehicles {

    @Id
    private String vehicleNmbr;

    private String chassisNmbr;

    private String isTheft;

}

