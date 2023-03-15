package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGet {
  private final CarGetService carGetService;

  public List<Carro> getAllCars(){
    return carGetService.getAllCars();
  }
  public Carro getCar(String placa){
    return carGetService.getCar(placa);
  }
}
