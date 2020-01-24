package com.harshrk.assignments.MatchObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BattingScorecard {

    private String playerType;
    private String playerName;
    private boolean isNotOut;
    private int runsScored;
    private int ballsPlayed;
    private int fours;
    private int sixes;
    private double strikeRate;

    @Override
    public String toString() {
        String stat = String.format("%s: %s%s Runs: %d, Balls: %d, Fours: %d, Sixes: %d, Strike rate: %.2f",
            playerType, playerName, (isNotOut ? "*" : ""), runsScored, ballsPlayed, fours, sixes, strikeRate);
            return stat;
    }
}
