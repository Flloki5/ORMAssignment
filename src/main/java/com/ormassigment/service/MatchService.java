package com.ormassigment.service;

import com.ormassigment.repository.MatchRepository;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    private MatchRepository matchRepository;


    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

}
