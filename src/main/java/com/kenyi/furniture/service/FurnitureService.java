package com.kenyi.furniture.service;

import com.kenyi.furniture.collection.Furniture;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FurnitureService {
    String  saveFurniture(Furniture furniture);
    List<Furniture> furnitureList();
    String updateFurniture(Long id, Furniture furniture);
     String deleteFurniture(Long id);
    Double totalPrice();
}
