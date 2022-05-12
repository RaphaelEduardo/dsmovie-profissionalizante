package com.raphaeleduardo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeleduardo.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
