package com.ormassigment.repository;

import com.ormassigment.model.Match;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> findAll();

    /*@Query ("select MATCH_ID from ( select top 1 MATCH_ID, (GOALS_AWAY + GOALS_HOME) as totalgoals from MATCH group by MATCH_ID order by totalgoals DESC;")
    Long getBestMatch();*/


}
