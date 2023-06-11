package com.msglearning.javabackend.repositories;

import com.msglearning.javabackend.entity.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();

    @Query("SELECT b FROM Book b WHERE b.title LIKE %:token% or b.subTitle LIKE %:token% ")
    List<Book> findByTitle(@Param("token") String token);

    @Query("SELECT b FROM Book b where b.author LIKE %:author%")
    List<Book> findByAuthor(@Param("author") String author);

    @Query("SELECT b FROM Book b WHERE b.publishingHouse LIKE %:publishingHouse%")
    List<Book> findByPublishingHouse(@Param("publishingHouse") String publishingHouse);

    Optional<Book> findById(Long id);

    @Query("SELECT b.coverImage FROM Book b WHERE b.id = :id")
    Optional<String> findCoverImageById(@Param("id") Long id);


}
