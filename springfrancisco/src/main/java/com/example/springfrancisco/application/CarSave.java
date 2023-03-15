package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarSaveService;
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
