package com.example.springfrancisco.infrastructure.adapter.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.PostService;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoPostAdapter implements PostService<Moto> {

  private final MotoRepository motoRepository;
  private final MotoMapper motoMapper;


  @Override
  public Moto save(Moto moto) {
    return motoMapper.toEntity(motoRepository.save(motoMapper.toDto(moto)));
  }
}
