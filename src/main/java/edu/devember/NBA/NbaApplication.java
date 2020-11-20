package edu.devember.NBA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

			Player thePlayer0 = new Player("Anthony Davis", 3);
			Player thePlayer1 = new Player("Kyle Kuzma", 0);
			Player thePlayer2 = new Player("LeBron James", 23);


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
