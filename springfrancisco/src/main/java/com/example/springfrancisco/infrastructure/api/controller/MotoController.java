package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.moto.MotoGet;
import com.example.springfrancisco.application.moto.MotoPost;
import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.entities.Moto;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/moto")
public class MotoController {

  private final MotoGet motoGet;
  private final MotoPost motoPost;

  @GetMapping
  public ResponseEntity<List<Moto>> getAllMotos() {
    return ResponseEntity.ok(motoGet.getAllMotos());
  }

  @GetMapping(path = "{placa}")
  public ResponseEntity<Moto> getMoto(@PathVariable("placa") String placa) {
    return ResponseEntity.ok(motoGet.getMoto(placa));
  }

  @PostMapping
  public ResponseEntity<Moto> addMoto(@RequestBody Moto moto) {
    return new ResponseEntity<>(motoPost.saveMoto(moto), HttpStatus.CREATED);
  }

}
