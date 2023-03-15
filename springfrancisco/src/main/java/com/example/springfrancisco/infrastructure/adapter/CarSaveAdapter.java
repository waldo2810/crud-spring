package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarSaveService;
import com.example.springfrancisco.infrastructure.mapper.CarMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarSaveAdapter implements CarSaveService {

  private final CarRepository carRepository;
  private final CarMapper carMapper;

  @Override
  public Carro save(Carro carro) {
    return carMapper.toEntity(carRepository.save(carMapper.toDto(carro)));
  }

}
