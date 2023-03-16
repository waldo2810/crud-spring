package com.example.springfrancisco.infrastructure.mapper;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

  @Mapping(target = "marca", source = "marca")
  @Mapping(target = "placa", source = "placa")
  @Mapping(target = "modelo", source = "modelo")
  @Mapping(target = "precio", source = "precio")
  @Mapping(target = "color", source = "color")
  CarroDto toDto(Carro carro);

  Carro toEntity(CarroDto carroDto);
}