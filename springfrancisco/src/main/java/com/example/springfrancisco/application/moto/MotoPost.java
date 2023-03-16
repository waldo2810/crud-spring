package com.example.springfrancisco.application.moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoPost {

  private final PostService<Moto> postService;

  public Moto saveMoto(Moto moto) {
    return postService.save(moto);
  }
}
