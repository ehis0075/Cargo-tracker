package com.example.app.Cargotracker;

import java.util.List;


public interface CargoRepository {

    public void save(Cargo cargo);

    public List<Cargo> getAllCargo();

    public Cargo findByCargoId(Long id) throws NoCargoFoundException;
}
