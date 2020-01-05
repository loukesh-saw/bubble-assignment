package com.assignment.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.domain.Player;

@Repository
public interface PlayersRepository extends CrudRepository<Player, Integer>  {
	
}
