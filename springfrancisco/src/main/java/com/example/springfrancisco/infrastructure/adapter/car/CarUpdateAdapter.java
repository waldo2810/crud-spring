package com.example.springfrancisco.infrastructure.adapter.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.car.CarUpdateService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CarUpdateAdapter implements CarUpdateService {

  private final CarRepository carRepository;

  @Override
  @Transactional
  public void updateCar(Carro carro) {
    carRepository.updateCarro(carro.getMarca(),
        carro.getPlaca(),
        carro.getModelo(),
        carro.getPrecio(),
        carro.getColor());
  }
}
