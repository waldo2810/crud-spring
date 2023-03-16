package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
@Entity
public class CarroDto extends VehiculoDto {

  private String color;

  public CarroDto(String marca, String placa, String modelo, double precio, String color) {
    super(marca, placa, modelo, precio);
    this.color = color;
  }
}
