package edu.devember.NBA.repository;

import edu.devember.NBA.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// This annotation allows to change an endpoint name based on entity type to a custom name
@RepositoryRestResource(collectionResourceRel = "players", path = "players")
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findBySalary(@Param("salary") double salary);

}
