package com.example.springfrancisco.application.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.GetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoGet {

  private final GetService<Moto> getService;

  public List<Moto> getAllMotos() {
    return getService.getAllItems();
  }

  public Moto getMoto(String placa) {
    return getService.getItem(placa);
  }

}
