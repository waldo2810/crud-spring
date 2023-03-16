package com.example.springfrancisco.infrastructure.repository;

import com.example.springfrancisco.infrastructure.dto.MotoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MotoRepository extends JpaRepository<MotoDto, String> {

  @Query(
      nativeQuery = true,
      value = "update moto_dto set marca = :marca, modelo = :modelo, " +
              "precio = :precio, color = :color, cilindraje = :cilindraje, " +
              "es_electrica = :es_electrica where placa = :placa"
  )
  @Modifying
  void updateMoto(
      @Param(value = "placa") String placa,
      @Param(value = "marca") String marca,
      @Param(value = "modelo") String modelo,
      @Param(value = "precio") double precio,
      @Param(value = "color") String color,
      @Param(value = "cilindraje") String cilindraje,
      @Param(value = "es_electrica") boolean esElectrica
  );
}
