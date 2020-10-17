package com.ormassigment.service;

import com.ormassigment.model.Match;
import com.ormassigment.model.Team;
import com.ormassigment.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private TeamRepository teamRepository;


    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAll(){
        return teamRepository.findAll();
    }

    public List<Team> contains() {
        return teamRepository.findByNameContaining("FC");
    }
}
