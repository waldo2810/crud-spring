package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.car.CarPost;
import com.example.springfrancisco.domain.entities.Carro;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController(value = "/message")
public class MessageController {
  //va hasta la aplicacion
  //baja hasta el dominio
  //baja hasta adaptador
  //adaptador llama a publisher creado
  //publisher tiene metodo que se le pasa string
  //publica evento en la cola de mensajes
  private final CarPost carPost;

  @PostMapping
  public ResponseEntity<Carro> addCar(@RequestBody Carro car) {
    return new ResponseEntity<>(carPost.saveCar(car), HttpStatus.CREATED);
  }
}
