package dev.vinca.springbootjigsaw.learn.animals.bird;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Example
 */
public interface BirdRepository extends MongoRepository<Bird, String> {
    
}
