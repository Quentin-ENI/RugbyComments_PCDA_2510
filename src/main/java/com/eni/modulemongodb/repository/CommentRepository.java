package com.eni.modulemongodb.repository;

import com.eni.modulemongodb.bo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}
