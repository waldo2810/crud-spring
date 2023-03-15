package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class VehiculoDto {

  @Id
  private String placa;
  private String marca;
  private String modelo;
  private double precio;
}
