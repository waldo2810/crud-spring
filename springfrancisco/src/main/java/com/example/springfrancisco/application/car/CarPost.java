package com.example.springfrancisco.application.car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarPost {

  private final PostService<Carro> postService;

  public Carro saveCar(Carro car) {
    return postService.save(car);
  }
}
