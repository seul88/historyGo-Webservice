package com.boraji.tutorial.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ViewController {

   @Autowired
   UserRepository userRepository;


   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      User user;
      user = userRepository.findByNameIgnoreCase(name);

      try {
         user = userRepository.findByNameIgnoreCase(name);
         model.addAttribute("name", user.getName());
         model.addAttribute("points", user.getPoints());
         model.addAttribute("id", user.getId());
         model.addAttribute("places", user.getPlaces());
      }
      catch (NullPointerException ex){
         model.addAttribute("errorMessage", "Player not found!");
         return "errorMsg";
      }


      return "hello";
   }

   @PostMapping("/listUsers")
   public String listUsers(ModelMap model){
      ArrayList<User> users = new ArrayList<>();
      users = (ArrayList<User>) userRepository.findAll();
      model.addAttribute("users", users);

      return "users";
   }
}
