package org.example.repository;

import org.example.entity.UserCityLikes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCityLikesRepo extends MongoRepository<UserCityLikes, String> {
    UserCityLikes getByUserId(String userId);
}