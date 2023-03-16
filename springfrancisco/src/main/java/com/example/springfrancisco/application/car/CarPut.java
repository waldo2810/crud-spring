package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.PutService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarPut {

  private final PutService<Carro> putService;

  public void updateCar(Carro carro) {
    putService.updateVehicle(carro);
  }
}
