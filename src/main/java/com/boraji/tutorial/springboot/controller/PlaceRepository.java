package com.boraji.tutorial.springboot.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository  extends MongoRepository<User, String>, QueryDslPredicateExecutor<Place> {

   Place findByNameIgnoreCase(String name);

   Place findById(String id);


}
