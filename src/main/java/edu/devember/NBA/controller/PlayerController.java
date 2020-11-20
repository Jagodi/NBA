package edu.devember.NBA.controller;

import edu.devember.NBA.model.Player;
import edu.devember.NBA.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository thePlayerRepository;

    @GetMapping("/test/{playerID}")
    public String getSmall(@PathVariable int playerID) {

        Player thePlayer;

        Optional<Player> optionalPlayer = thePlayerRepository.findById((long) playerID);
        if (optionalPlayer.isPresent()) {
            thePlayer = optionalPlayer.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + playerID);
        }

        // some work
        String result = thePlayer.getPlayerName().substring(0,3);

        return result;
    }
}
