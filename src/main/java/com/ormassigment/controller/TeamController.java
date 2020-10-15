package com.ormassigment.controller;

import com.ormassigment.service.TeamService;
import org.springframework.stereotype.Controller;

@Controller
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
}
