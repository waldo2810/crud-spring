package com.example.springfrancisco.domain.service;

import com.example.springfrancisco.domain.entities.Carro;
import java.util.List;

public interface CarGetService {
  List<Carro> getAllCars();
  Carro getCar(String placa);
}
