package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarGetService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.mapper.CarMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGetAdapter implements CarGetService {

  private final CarRepository carRepository;
  private final CarMapper carMapper;

  @Override
  public List<Carro> getAllCars() {
    List<CarroDto> carrosDto = carRepository.findAll();
    return carrosDto.stream().map(carMapper::toEntity).toList(); //toEntity(toDto(carros))
  }

  @Override
  public Carro getCar(String placa) {
    Optional<CarroDto> carroDto = carRepository.findById(placa);
    return carroDto.map(carMapper::toEntity).orElse(null);
  }

}
