package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	
}
