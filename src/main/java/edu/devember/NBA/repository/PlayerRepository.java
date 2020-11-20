package edu.devember.NBA.repository;

import edu.devember.NBA.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// This annotation allows to change an endpoint name based on entity type to a custom name
//@RepositoryRestResource(collectionResourceRel = "player", path = "player")
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
