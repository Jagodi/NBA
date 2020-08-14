package edu.devember.NBA.repository;

import edu.devember.NBA.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
