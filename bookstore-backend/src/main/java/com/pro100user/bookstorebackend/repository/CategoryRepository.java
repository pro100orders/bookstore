package com.pro100user.bookstorebackend.repository;

import com.pro100user.bookstorebackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value = "SELECT * FROM categories WHERE name = :name", nativeQuery = true)
    Optional<Category> findByName(@Param("name") String name);
}
