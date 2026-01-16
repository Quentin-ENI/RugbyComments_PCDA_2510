package com.eni.modulemongodb.repository;

import com.eni.modulemongodb.bo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void save_comment() {
        Comment comment = Comment.builder().content("Très bon joueur de rugby").author("Josiane").build();

        this.commentRepository.save(comment);
    }
}
