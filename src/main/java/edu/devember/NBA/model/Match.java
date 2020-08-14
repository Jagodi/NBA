package edu.devember.NBA.model;

import java.util.Arrays;

public class Match {

    private Long id;
    private String finalScore;
    private byte[] teams;

    public Match() {
    }

    public Match(String finalScore, byte[] teams) {
        this.finalScore = finalScore;
        this.teams = teams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    public byte[] getTeams() {
        return teams;
    }

    public void setTeams(byte[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", finalScore='" + finalScore + '\'' +
                ", teams=" + Arrays.toString(teams) +
                '}';
    }
}
