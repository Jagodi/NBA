package edu.devember.NBA.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "teamName")
    private String teamName;

    @OneToMany(mappedBy = "team")
    private Set<Player> players = new HashSet<>();

    public Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player thePlayer) {
        if (thePlayer == null) {
            throw new NullPointerException("Can`t add the null player");
        }
        if (thePlayer.getTeam() != null) {
            throw new IllegalStateException("Player is already assigned to the team");
        }
        players.add(thePlayer);
        thePlayer.setTeam(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", team=" + players +
                '}';
    }
}
