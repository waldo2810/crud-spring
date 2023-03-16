package com.example.springfrancisco.infrastructure.adapter.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.DeleteService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDeleteAdapter implements DeleteService<Carro> {

  private final CarRepository carRepository;

  @Override
  public void deleteVehicle(String placa) {
    carRepository.deleteById(placa);
  }
}
