package com.msglearning.javabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = Book.TABLE_NAME)
public class Book {
    static final String TABLE_NAME = "book";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column
    private String subTitle;
    @Column(nullable = false)
    private String author;
    @Column
    private String publishingHouse;
    @Column(name = "coverImage")
    private String coverImage;
    @Column
    private Double rating;

}
