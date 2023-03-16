package com.example.springfrancisco.infrastructure.adapter.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.PutService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CarPutAdapter implements PutService<Carro> {

  private final CarRepository carRepository;

  @Override
  @Transactional
  public void updateVehicle(Carro carro) {
    carRepository.updateCarro(carro.getMarca(),
        carro.getPlaca(),
        carro.getModelo(),
        carro.getPrecio(),
        carro.getColor());
  }
}
