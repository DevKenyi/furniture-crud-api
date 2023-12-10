package com.kenyi.furniture.controller;

import com.kenyi.furniture.collection.Furniture;
import com.kenyi.furniture.service.FurnitureService;
import com.mongodb.client.model.geojson.LineString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FurnitureController {

    @Autowired
   private FurnitureService service;


    @PostMapping("/save-furniture")
    public String saveFurniture(@RequestBody Furniture furniture){

        return service.saveFurniture(furniture);
    }
    @GetMapping("/furniture-list")
    public List<Furniture> getFurnitureList(){
        return service.furnitureList();
    }

    @PutMapping("update-furniture/{id}")
    public String updateFurniture(@PathVariable Long id, @RequestBody Furniture furniture){
        return service.updateFurniture(id, furniture);
    }

    @DeleteMapping("delete-furniture/{id}")
    public String deleteFurnitureById(@PathVariable Long id){
        return service.deleteFurniture(id);
    }

}
