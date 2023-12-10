package com.kenyi.furniture.service;


import com.kenyi.furniture.collection.Furniture;
import com.kenyi.furniture.repo.FurnitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FurnitureServiceImp implements FurnitureService {
    @Autowired
    private FurnitureRepo repo;
    @Override
    public String saveFurniture(Furniture furniture) {
        try {
            Furniture newFurniture = repo.save(furniture);
            return "Furniture is saved successfully"+ newFurniture.getId();

        }
        catch (Exception e){
            e.printStackTrace();

            return "Sorry, could not save furniture to database";
        }


    }

    @Override
    public List<Furniture> furnitureList() {
        return repo.findAll();
    }

    @Override
    public String updateFurniture(Long id, Furniture furniture) {
        Optional<Furniture> optionalFurniture = repo.findById(id);

        if (optionalFurniture.isPresent()) {
            Furniture existingFurniture = optionalFurniture.get();


            if (furniture.getBrand() != null) {
                existingFurniture.setBrand(furniture.getBrand());
            }

            if (furniture.getFurnitureType() != null) {
                existingFurniture.setFurnitureType(furniture.getFurnitureType());
            }

            if (furniture.getQuantity() != null) {
                existingFurniture.setQuantity(furniture.getQuantity());
            }

            if (furniture.getPrice() != null) {
                existingFurniture.setPrice(furniture.getPrice());
            }

            if (furniture.getMaterial() != null) {
                existingFurniture.setMaterial(furniture.getMaterial());
            }

            // Save the updated furniture
            Furniture updatedFurniture = repo.save(existingFurniture);

            // Return a meaningful response
            return "Furniture with id " + id + " updated successfully" + repo.save(updatedFurniture);
        } else {
            return "Furniture with id " + id + " not found";
        }
    }


    @Override
    public String deleteFurniture(Long id) {
        Optional<Furniture> furnitureId = repo.findFurnitureById(id);
        if(furnitureId.isPresent()){
            repo.deleteById(id);
          return  "User was deleted successfully " + furnitureId;
        }
        else
             return "This user with an ID  "+ id +" was not found in database";


    }

    @Override
    public Double totalPrice() {
        return null;
    }
}
