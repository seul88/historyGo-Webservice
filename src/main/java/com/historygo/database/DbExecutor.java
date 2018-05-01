package com.historygo.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbExecutor implements CommandLineRunner {

    private UserRepository userRepository;


    public DbExecutor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User erwin = new User(
                "Erwin",
                0,
                new ArrayList<>()
        );

        User pavlo = new User(
                "Pavlo",
                15,
                Arrays.asList(
                        new Place(
                                "Ratusz",
                                "Dawna siedziba wladz miasta",
                                15
                        )
                )
        );

        User bolivar = new User(
                "Bolivar",
                11,
                new ArrayList<Place>()
        );

      //  this.userRepository.deleteAll();;

        List<User> users = Arrays.asList(erwin, pavlo, bolivar);

     //   this.userRepository.saveAll(users);

    }
}
