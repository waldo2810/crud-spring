package com.example.springfrancisco.application.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.moto.MotoGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoGet {

  private final MotoGetService motoGetService;

  public List<Moto> getAllMotos() {
    return motoGetService.getAllMotos();
  }

  public Moto getMoto(String placa) {
    return motoGetService.getMoto(placa);
  }

}
