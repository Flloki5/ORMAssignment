package com.ormassigment.controller;

import com.ormassigment.service.MatchService;
import com.ormassigment.service.TeamService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private MatchService matchService;
    private TeamService teamService;

    public AppController(MatchService matchService, TeamService teamService) {
        this.matchService = matchService;
        this.teamService = teamService;
    }

    @GetMapping("/index")
    public String getQuestList(Model model) {
        model.addAttribute("teams", teamService.getAll());
        model.addAttribute("matches", matchService.getAll());

        model.addAttribute("fcnames", teamService.contains());

        return "index";
    }
}
