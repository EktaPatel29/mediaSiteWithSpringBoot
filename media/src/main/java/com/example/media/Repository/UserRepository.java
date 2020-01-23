package com.example.media.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.media.Model.User;

public interface UserRepository extends MongoRepository<User, String> {
	User findByid(ObjectId id);
	
	@Override
    void delete(User deleted);
}
