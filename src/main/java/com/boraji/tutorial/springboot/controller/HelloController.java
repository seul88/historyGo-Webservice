package com.boraji.tutorial.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

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
      }
      catch (NullPointerException ex){

         model.addAttribute("name", "AAAAAAAAAAAAAAAAAA");
         System.out.println("Player not found");
         return "hello";
      }


      return "hello";
   }
}
