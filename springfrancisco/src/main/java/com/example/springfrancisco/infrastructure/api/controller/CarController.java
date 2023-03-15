package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.CarGet;
import com.example.springfrancisco.application.CarSave;
import com.example.springfrancisco.domain.entities.Carro;
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
@RequestMapping(path = "/car")
public class CarController {

  private final CarSave carSave;
  private final CarGet carGet;

  @GetMapping(path = "all")
  public ResponseEntity<List<Carro>> getAllCars() {
    return ResponseEntity.ok(carGet.getAllCars());
  }

  @GetMapping(path = "{placa}")
  public ResponseEntity<Carro> getCar(@PathVariable("placa") String placa) {
    return ResponseEntity.ok(carGet.getCar(placa));
  }

  @PostMapping(path="save")
  public ResponseEntity<Carro> addCar(@RequestBody Carro car) {
    return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);
  }
}
