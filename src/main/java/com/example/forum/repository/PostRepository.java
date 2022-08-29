package com.example.forum.repository;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.forum.models.PostEntity;

@Repository
public interface PostRepository extends ElasticsearchRepository<PostEntity,String>{
    
}
