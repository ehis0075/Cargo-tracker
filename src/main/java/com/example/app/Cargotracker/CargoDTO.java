package com.example.app.Cargotracker;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CargoDTO implements Serializable {


    private Long id;

    private String cargoName;

    private String location;

    private String destination;
}
