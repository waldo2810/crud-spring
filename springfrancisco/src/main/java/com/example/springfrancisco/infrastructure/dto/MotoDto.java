package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
public class MotoDto extends VehiculoDto {

  private String color;
  private String cilindraje;
  private boolean esElectrica;

  public MotoDto(String placa, String marca, String modelo, double precio, String color,
      String cilindraje, boolean esElectrica) {
    super(placa, marca, modelo, precio);
    this.color = color;
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }

}
