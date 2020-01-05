package com.assignment.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.domain.Matches;
import com.assignment.domain.Player;
import com.assignment.service.CricketService;


@RestController
@RequestMapping("/cricket")
public class CricketResource {
	@Autowired
	CricketService cricketService;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Matches> allMatches() {
		List<Matches> matches = cricketService.allMatches();
		return matches;
	}
	
	@GetMapping(value = "/byTeamName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Player> findPlayerByTeam(@PathVariable String name) {
		List<Player> players = cricketService.findByTeamName(name);
		return players;
	}
	
	@GetMapping(value = "/byPlayerId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Player> findPlayerById(@PathVariable int id) {
		Optional<Player> player = cricketService.findPlayerById(id);
		return player;
	}

}
