package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.moto.MotoGet;
import com.example.springfrancisco.domain.entities.Moto;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/moto")
public class MotoController {

  private final MotoGet motoGet;

  @GetMapping
  public ResponseEntity<List<Moto>> getAllMotos() {
    return ResponseEntity.ok(motoGet.getAllMotos());
  }
}