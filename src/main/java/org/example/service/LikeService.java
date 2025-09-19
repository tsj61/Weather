package org.example.service;

import java.util.List;

public interface LikeService {
    List<String> getAllLikedCities();

    void addNewLikedCity(String cityId);

    void deleteLikedCity(String cityId);
}
