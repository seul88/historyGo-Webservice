package com.historygo.controller.place;


import com.historygo.controller.Place;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceRepository placeRepository;

    public PlaceController(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }


    @GetMapping("/all")
    public List<Place> getAllPlaces(){
        List<Place> places =  this.placeRepository.findAll();

        return places;
    }

    @PutMapping
    public void insert(@RequestBody Place place){
        this.placeRepository.insert(place);
    }

    @PostMapping
    public void update(@RequestBody Place place){
        this.placeRepository.save(place);
    }

    @GetMapping("/id/{id}")
    public Place getById(@PathVariable("id") String id){
        Place place = this.placeRepository.findById(id);

        return place;
    }

    @PutMapping("/id/{id}")
    public void setPlaceNameById(@PathVariable("id") String id, @RequestBody String name){
        Place place = this.placeRepository.findById(id);
        place.setName(name);
        this.placeRepository.save(place);
    }

    @GetMapping("/name/{name}")
    public Place getByName(@PathVariable("name") String name){
        Place place = this.placeRepository.findByNameIgnoreCase(name);

        return place;
    }

    @PutMapping("/name/{name}")
    public void setPlaceName(@PathVariable("name") String name, @RequestBody String ref){
        Place place = this.placeRepository.findByNameIgnoreCase(name);
        place.setName(ref);
        this.placeRepository.save(place);
    }

    @GetMapping("/rating/{rating}")
    public List<Place> findByRatingGreaterThan(@PathVariable("rating") double rating){

        List<Place> places =  this.placeRepository.findByRatingGreaterThan(rating);

        return places;
    }

    @GetMapping("/points/{points}")
    public List<Place> findByPointsGreaterThan(@PathVariable("points") int points){

        List<Place> places =  this.placeRepository.findByPointsGreaterThan(points);

        return places;
    }

}
