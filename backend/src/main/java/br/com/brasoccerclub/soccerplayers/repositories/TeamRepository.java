package br.com.brasoccerclub.soccerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brasoccerclub.soccerplayers.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
