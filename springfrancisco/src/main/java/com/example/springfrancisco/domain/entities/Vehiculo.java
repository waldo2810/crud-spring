package com.example.springfrancisco.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehiculo implements Acelerar, Frenar, IniciarMarcha, Comparable<Vehiculo> {

  private String placa;
  private String marca;
  private String modelo;
  private double precio;

  @Override
  public int compareTo(Vehiculo o) {
    return 0;
  }
}
