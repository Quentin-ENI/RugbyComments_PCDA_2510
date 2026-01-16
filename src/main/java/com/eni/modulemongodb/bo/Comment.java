package com.eni.modulemongodb.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "comments")
public class Comment {
    @Id
    private String id;
    @Field(name = "content")
    private String content;
    @Field(name = "author")
    private String author;
}
