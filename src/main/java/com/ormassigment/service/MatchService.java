package com.ormassigment.service;

import com.ormassigment.model.Match;
import com.ormassigment.repository.MatchRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MatchService {

    private MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> getAll(){
        return matchRepository.findAll();
    }

}
