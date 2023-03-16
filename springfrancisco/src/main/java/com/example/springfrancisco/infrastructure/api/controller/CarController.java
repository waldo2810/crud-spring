package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.car.CarDelete;
import com.example.springfrancisco.application.car.CarGet;
import com.example.springfrancisco.application.car.CarSave;
import com.example.springfrancisco.application.car.CarUpdate;
import com.example.springfrancisco.domain.entities.Carro;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/cars")
public class CarController {

  private final CarSave carSave;
  private final CarGet carGet;
  private final CarDelete carDelete;
  private final CarUpdate carUpdate;

  @GetMapping
  public ResponseEntity<List<Carro>> getAllCars() {
    return ResponseEntity.ok(carGet.getAllCars());
  }

  @GetMapping(path = "{placa}")
  public ResponseEntity<Carro> getCar(@PathVariable("placa") String placa) {
    return ResponseEntity.ok(carGet.getCar(placa));
  }

  @PostMapping
  public ResponseEntity<Carro> addCar(@RequestBody Carro car) {
    return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);
  }

  @PutMapping(value = "/update")
  public void editCar(@RequestBody Carro car) {
    carUpdate.updateCar(car);
  }
  //	PATCH | Update a product partially | /update/id

  @Transactional
  @DeleteMapping(path = "{placa}")
  public void deleteCar(@PathVariable("placa") String placa) {
    carDelete.deleteCar(placa);
  }
}