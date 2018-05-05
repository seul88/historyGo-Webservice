package com.historygo.database;


import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.NumberExpression;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {



    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/all")
    public List<User> getAll(){
        List<User> users = this.userRepository.findAll();

        return users;
    }

    @PutMapping
    public void insert(@RequestBody User user){
        this.userRepository.insert(user);
    }

    @PostMapping
    public void update(@RequestBody User user){
        this.userRepository.save(user);
    }

    @GetMapping("/id/{id}")
    public User getById(@PathVariable("id") String id){
        User user = this.userRepository.findById(id);

        return user;
    }

    @PutMapping("/id/{id}")
    public void setUserNameById(@PathVariable("id") String id, @RequestBody String name){
        User user = this.userRepository.findById(id);
        user.setName(name);
        this.userRepository.save(user);
    }

    @GetMapping("/name/{name}")
    public User getByName(@PathVariable("name") String name){
        User user = this.userRepository.findByNameIgnoreCase(name);

        return user;
    }

    @PutMapping("/name/{name}")
    public void setUserName(@PathVariable("name") String name, @RequestBody String nick){
        User user = this.userRepository.findByNameIgnoreCase(name);
        user.setName(nick);
        this.userRepository.save(user);
    }


    @GetMapping("/points/{points}")
    public List<User> getByPoints(@PathVariable("points") int points){
        // find users with points more than {points} variable

        List<User> users = this.userRepository.findByPointsGreaterThan(points);

        return users;
    }



    // TODO
    // 1. sumowanie punktow dla uzytkownika (po polach Points w Places)
    // 2. tworzenie rankingu - sortowanie uzytkownikow po punktach


}
