package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.CityDTO;
import org.example.entity.City;
import org.example.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @GetMapping("/all")
    public ResponseEntity<List<City>> getAllCities() {
        return new ResponseEntity<>(cityService.getAllCities(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<CityDTO> getCityByName(@PathVariable String name) {
        return new ResponseEntity<>(cityService.getCityByName(name), HttpStatus.OK);
    }
}
