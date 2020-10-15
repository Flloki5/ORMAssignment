package com.ormassigment.controller;

import com.ormassigment.service.MatchService;
import org.springframework.stereotype.Controller;

@Controller
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }


}
