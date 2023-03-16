package com.example.springfrancisco.application.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.PutService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoPut {

  private final PutService<Moto> putService;

  public void updateMoto(Moto moto) {
    putService.updateVehicle(moto);
  }
}
