package com.example.springfrancisco.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehiculo {

  private String placa;
  private String marca;
  private String modelo;
  private double precio;

}
