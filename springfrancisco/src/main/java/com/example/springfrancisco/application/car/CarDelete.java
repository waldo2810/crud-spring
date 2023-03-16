package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.service.car.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

  private final CarDeleteService carDeleteService;

  public void deleteCar(String placa) {
    carDeleteService.deleteCar(placa);
  }


}