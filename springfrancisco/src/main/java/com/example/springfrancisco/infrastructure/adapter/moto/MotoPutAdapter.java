package com.example.springfrancisco.infrastructure.adapter.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.PutService;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class MotoPutAdapter implements PutService<Moto> {

  private final MotoRepository motoRepository;

  @Override
  @Transactional
  public void updateVehicle(Moto moto) {
    motoRepository.updateMoto(
        moto.getPlaca(),
        moto.getMarca(),
        moto.getModelo(),
        moto.getPrecio(),
        moto.getColor(),
        moto.getCilindraje(),
        moto.isEsElectrica()
    );
  }
}
