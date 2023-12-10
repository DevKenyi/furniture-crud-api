package com.kenyi.furniture.repo;

import com.kenyi.furniture.collection.Furniture;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FurnitureRepo extends MongoRepository<Furniture, Long> {
    Optional<Furniture> findFurnitureById(Long id);
}
