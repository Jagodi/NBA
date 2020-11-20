package edu.devember.NBA.repository;

import edu.devember.NBA.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepository extends JpaRepository<Team, Long> {

}
