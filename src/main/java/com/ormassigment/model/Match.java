package com.ormassigment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MATCH_ID")
    private long matchId;

    private String date;

    @Column(name = "HOME_TEAM_ID")
    private Long homeTeamId;

    private Long awayTeamId;
    private int goalsHome;
    private int goalsAway;
}
