package com.assignment.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.assignment.domain.Matches;
import com.assignment.domain.Player;
import com.assignment.repository.MatchesRepository;
import com.assignment.repository.PlayersRepository;

@Service
public class CricketService {

	@Autowired
	MatchesRepository matchesRepository;

	@Autowired
	PlayersRepository playersRepository; 
	
	@Autowired
	private final JdbcTemplate jdbcTemplate;


	public CricketService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	} 

	public List<Matches> allMatches() {
		List<Matches> matches = (List<Matches>) matchesRepository.findAll();
		return matches;
	}

	public List<Player> allPlayers() {
		List<Player> players = (List<Player>) playersRepository.findAll();
		return players;
	}

	public Optional<Player> findPlayerById(int id) {
		Optional<Player> player = playersRepository.findById(id);
		return player;
	}

	public List<Player> findByTeamName(String team_name) {
		final String findByTeamName = "select * from player where team_name='"+team_name+"'";
		List<Player> players =jdbcTemplate.query(findByTeamName, new RowMapper<Player>() {

			@Override
			public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Player player = new Player();
				player.setId(rs.getInt("id"));
				player.setName(rs.getString("name"));
				player.setRun_rate(rs.getInt("run_rate"));
				player.setTeam_name(rs.getString("team_name"));
				return player;
			}

		});
		return players;
	}
	
}
