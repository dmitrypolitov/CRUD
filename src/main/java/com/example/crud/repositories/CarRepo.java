package com.example.crud.repositories;

import com.example.crud.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CarRepo extends JpaRepository<Car, Long> {
}
