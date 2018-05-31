package com.historygo.controller.place;

import com.historygo.controller.Place;
import com.historygo.controller.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository  extends MongoRepository<Place, String>, QueryDslPredicateExecutor<Place> {

   Place findByNameIgnoreCase(String name);

   Place findById(String id);

   List<Place> findByRatingGreaterThan(double rating);

   List<Place> findByPointsGreaterThan(int points);


}
