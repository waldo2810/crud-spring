package com.example.springfrancisco.infrastructure.adapter.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.DeleteService;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoDeleteAdapter implements DeleteService<Moto> {

  private final MotoRepository motoRepository;


  @Override
  public void deleteVehicle(String placa) {
    motoRepository.deleteById(placa);
  }
}
