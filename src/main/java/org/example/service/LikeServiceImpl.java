package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.UserCityLikes;
import org.example.repository.UserCityLikesRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class LikeServiceImpl implements LikeService {

    private UserCityLikesRepo userCityLikesRepo;

    @Override
    public List<String> getAllLikedCities() {
        UserCityLikes userCityLikes = userCityLikesRepo.getByUserId("68c33cd3ff04429b707bb2ca");
        return userCityLikes.getLikedCityIds();
    }

    @Override
    public void addNewLikedCity(String cityId) {
        UserCityLikes userCityLikes = userCityLikesRepo.getByUserId("68c33cd3ff04429b707bb2ca");
        userCityLikes.getLikedCityIds().add(cityId);
        userCityLikesRepo.save(userCityLikes);
    }

    @Override
    public void deleteLikedCity(String cityId) {
        UserCityLikes userCityLikes = userCityLikesRepo.getByUserId("68c33cd3ff04429b707bb2ca");
        List<String> cities = userCityLikes.getLikedCityIds().stream().filter(l -> !Objects.equals(l, cityId)).toList();
        userCityLikes.setLikedCityIds(cities);
        userCityLikesRepo.save(userCityLikes);
    }
}
