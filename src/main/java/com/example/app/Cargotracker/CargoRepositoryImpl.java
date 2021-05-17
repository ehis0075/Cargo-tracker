package com.example.app.Cargotracker;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
@Slf4j
public class CargoRepositoryImpl implements CargoRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Cargo cargo) {

        entityManager.persist(cargo);

    }

    @Override
    public List<Cargo> getAllCargo() {

        List<Cargo> allCargos = entityManager.createNamedQuery("findAll", Cargo.class)
                .getResultList();

        return allCargos;
    }

    @Override
    public Cargo findByCargoId(Long id) throws NoCargoFoundException {

        Cargo cargo = entityManager.createNamedQuery("findById", Cargo.class)
                        .setParameter("id", id)
                        .getSingleResult();
            if(cargo == null) {
                throw new NoCargoFoundException("Can't find cargo for ID " + id);
            }
            return cargo;


    }
}
