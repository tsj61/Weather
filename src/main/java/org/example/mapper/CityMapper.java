package org.example.mapper;

import org.example.dto.CityDTO;
import org.example.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDTO toDTO(City city);
}
