package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.service.LikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liked")
@AllArgsConstructor
public class LikeController {
    private LikeService likeService;

    @GetMapping("/city")
    public ResponseEntity<List<String>> getAllLikedCities() {
        List<String> all = likeService.getAllLikedCities();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @PostMapping("/city/{cityId}")
    public ResponseEntity<Void> addNewLikedCity(@PathVariable String cityId) {
        likeService.addNewLikedCity(cityId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/city/{cityId}")
    public ResponseEntity<Void> deleteLikedCity(@PathVariable String cityId) {
        likeService.deleteLikedCity(cityId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
