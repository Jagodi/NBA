package edu.devember.NBA.controller;

import edu.devember.NBA.exception.EntityNotFoundException;
import edu.devember.NBA.model.Player;
import edu.devember.NBA.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository thePlayerRepository;

    // return a short name based on a player name
    @GetMapping("/fun/{playerID}")
    public String getShortName(@PathVariable int playerID) {

        Player thePlayer;

        Optional<Player> optionalPlayer = thePlayerRepository.findById((long) playerID);
        if (optionalPlayer.isPresent()) {
            thePlayer = optionalPlayer.get();
        } else {
            throw new EntityNotFoundException("Did not find player with id - " + playerID);
        }

        return Arrays.stream(thePlayer.getPlayerName().split(" "))
                .map(a -> a.substring(0, 1))
                .collect(Collectors.joining());

    }


    /*@GetMapping("/fun/{playerID}")
    public String getTestShort(@PathVariable int playerID) {

        Player thePlayer = thePlayerRepository
                            .findById((long) playerID)
                            .orElseThrow(EntityNotFoundException::new);

        return thePlayer.getPlayerName().substring(0,3);
    }*/
}
