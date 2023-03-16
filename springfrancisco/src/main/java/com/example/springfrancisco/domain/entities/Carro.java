package com.example.springfrancisco.domain.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
public class Carro extends Vehiculo {

  private String color;

  public Carro(String marca, String placa, String modelo, Double precio, String color) {
    super(marca, placa, modelo, precio);
    this.color = color;
  }

  @Override
  public String toString() {
    return super.toString() + " \nColor: " + getColor();
  }

}