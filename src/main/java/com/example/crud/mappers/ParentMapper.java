package com.example.crud.mappers;

import com.example.crud.dto.ParentDTO;
import com.example.crud.models.Parent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParentMapper {

    @Mapping(target = "fullName", source = "name")
//    @Mapping(target = "id", ignore = true)
    ParentDTO toDTO(Parent user);

    List<ParentDTO> toDTOList(List<Parent> list);

}
