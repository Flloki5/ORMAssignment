package com.ormassigment.repository;

import com.ormassigment.model.Match;
import com.ormassigment.model.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {

    List<Team> findAll();

    List<Team> findByNameContaining(String infix);
}
