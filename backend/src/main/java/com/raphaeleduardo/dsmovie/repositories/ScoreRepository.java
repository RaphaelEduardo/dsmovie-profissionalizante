package com.raphaeleduardo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeleduardo.dsmovie.entities.Score;
import com.raphaeleduardo.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
