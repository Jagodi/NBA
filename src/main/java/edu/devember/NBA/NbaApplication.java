package edu.devember.NBA;

import edu.devember.NBA.model.Player;
import edu.devember.NBA.model.Team;
import edu.devember.NBA.repository.PlayerRepository;
import edu.devember.NBA.repository.TeamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbaApplication.class, args);
	}


	/*@Bean
	public CommandLineRunner mappingDemo(TeamRepository theTeamRepository,
										 PlayerRepository thePlayerRepository) {
		return args -> {

			// create a new team
			Team theTeam = new Team("Los Angeles Lakers");

			Player thePlayer0 = new Player("Anthony Davis", 3, 32_700_000);
			Player thePlayer1 = new Player("Kyle Kuzma", 0, 3_562_178);
			Player thePlayer2 = new Player("LeBron James", 23, 	39_219_566);


			// create and save new players
			theTeam.addPlayer(thePlayer0);
			theTeam.addPlayer(thePlayer1);
			theTeam.addPlayer(thePlayer2);

			// save the team
			theTeamRepository.save(theTeam);

			thePlayerRepository.save(thePlayer0);
			thePlayerRepository.save(thePlayer1);
			thePlayerRepository.save(thePlayer2);
		};
	}*/

}
