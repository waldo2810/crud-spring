package com.example.springfrancisco.infrastructure.mapper;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotoMapper {

  @Mapping(target = "marca", source = "marca")
  @Mapping(target = "placa", source = "placa")
  @Mapping(target = "modelo", source = "modelo")
  @Mapping(target = "precio", source = "precio")
  @Mapping(target = "color", source = "color")
  @Mapping(target = "cilindraje", source = "cilindraje")
  @Mapping(target = "esElectrica", source = "esElectrica")
  MotoDto toDto(Moto moto);

  Moto toEntity(MotoDto motoDto);
}
