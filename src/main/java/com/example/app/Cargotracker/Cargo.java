package com.example.app.Cargotracker;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@NamedQueries({
        @NamedQuery(name = "findAll", query = "select c from Cargo c"),
        @NamedQuery(name = "findById", query = "Select c from Cargo c where c.id = :id")
})
public class Cargo implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cargoName;

    private String location;

    private String destination;
}
