package com.example.media.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.media.Model.News;

public interface NewsRepository extends MongoRepository<News, String> {
		  News findByid(ObjectId id);
	
	@Override
    void delete(News deleted);
	
	


}
