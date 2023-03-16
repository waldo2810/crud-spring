package com.example.springfrancisco.domain.service.moto;


import com.example.springfrancisco.domain.entities.Moto;
import java.util.List;

public interface MotoGetService {

  List<Moto> getAllMotos();

  Moto getMoto(String placa);
}
