package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.car.CarUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarUpdate {

  private final CarUpdateService updateService;

  public void updateCar(Carro carro) {
    updateService.updateCar(carro);
  }
}
