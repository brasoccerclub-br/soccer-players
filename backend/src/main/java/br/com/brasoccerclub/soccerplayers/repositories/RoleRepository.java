package br.com.brasoccerclub.soccerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brasoccerclub.soccerplayers.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
