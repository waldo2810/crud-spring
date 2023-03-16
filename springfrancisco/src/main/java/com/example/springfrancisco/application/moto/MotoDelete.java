package com.example.springfrancisco.application.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.DeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoDelete {

  private final DeleteService<Moto> deleteService;

  public void deleteMoto(String placa) {
    deleteService.deleteVehicle(placa);
  }
}
