package com.example.app.Cargotracker;


import jdk.jfr.Threshold;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cargos")
@Slf4j
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;


    @PostMapping("/save")
    void save(@RequestBody Cargo cargo) {

        cargoRepository.save(cargo);
    }

    @GetMapping("/getCargoById/{id}")
    Cargo getById(@PathVariable("id") Long id) throws NoCargoFoundException {



        return cargoRepository.findByCargoId(id);
    }

    @GetMapping("/getAllCargos")
    List<Cargo> getAll(){

        return cargoRepository.getAllCargo();
    }


}
