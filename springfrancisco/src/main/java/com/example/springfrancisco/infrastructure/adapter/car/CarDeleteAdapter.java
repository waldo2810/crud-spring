package com.example.springfrancisco.infrastructure.adapter.car;

import com.example.springfrancisco.domain.service.car.CarDeleteService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDeleteAdapter implements CarDeleteService {

  private final CarRepository carRepository;

  @Override
  public void deleteCar(String placa) {
    carRepository.deleteById(placa);
  }
}
