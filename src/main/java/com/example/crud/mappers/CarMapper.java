package com.example.crud.mappers;


import com.example.crud.dto.CarDTO;
import com.example.crud.models.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDTO toDTO(Car car);

    List<CarDTO> toDTOList(List<Car> list);
}
