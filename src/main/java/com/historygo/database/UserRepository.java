package com.historygo.database;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String>, QueryDslPredicateExecutor<User> {

    public User findById(String id);

    List<User> findByPointsGreaterThan(int points);

    User findByName(String name);
}
