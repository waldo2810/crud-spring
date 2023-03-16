package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.car.CarSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarSave {

  private final CarSaveService carSaveService;

  public Carro saveCar(Carro car) {
    return carSaveService.save(car);
  }
}
