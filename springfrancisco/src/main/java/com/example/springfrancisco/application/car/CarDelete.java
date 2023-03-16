package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.DeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

  private final DeleteService<Carro> carDeleteService;

  public void deleteCar(String placa) {
    carDeleteService.deleteVehicle(placa);
  }


}
