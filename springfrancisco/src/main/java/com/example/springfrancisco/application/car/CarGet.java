package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.GetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGet {

  private final GetService<Carro> getService;

  public List<Carro> getAllCars() {
    return getService.getAllItems();
  }

  public Carro getCar(String placa) {
    return getService.getItem(placa);
  }
}
