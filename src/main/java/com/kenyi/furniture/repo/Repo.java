package com.kenyi.furniture.repo;

import com.kenyi.furniture.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<User, Long> {
}
