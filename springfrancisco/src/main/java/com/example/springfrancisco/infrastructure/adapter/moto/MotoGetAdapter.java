package com.example.springfrancisco.infrastructure.adapter.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.GetService;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoGetAdapter implements GetService<Moto> {

  private final MotoRepository motoRepository;
  private final MotoMapper motoMapper;

  @Override
  public List<Moto> getAllItems() {
    List<MotoDto> motosDto = motoRepository.findAll();
    return motosDto.stream().map(motoMapper::toEntity).toList();
  }

  @Override
  public Moto getItem(String placa) {
    Optional<MotoDto> motoDto = motoRepository.findById(placa);
    return motoDto.map(motoMapper::toEntity).orElse(null);
  }
}
