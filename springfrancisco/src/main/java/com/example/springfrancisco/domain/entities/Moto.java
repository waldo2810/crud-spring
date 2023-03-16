package com.example.springfrancisco.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Moto extends Vehiculo {

  private String color;
  private String cilindraje;
  private boolean esElectrica;

  public Moto(String placa, String marca, String modelo, double precio, String color,
      String cilindraje, boolean esElectrica) {
    super(placa, marca, modelo, precio);
    this.color = color;
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }

  @Override
  public String toString() {
    return "Moto{" +
        "color='" + color + '\'' +
        ", cilindraje='" + cilindraje + '\'' +
        ", esElectrica=" + esElectrica +
        '}';
  }
}
