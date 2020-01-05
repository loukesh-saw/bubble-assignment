package com.assignment.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player implements Serializable{
	
	@Id
	int id;
	String name;
	
	@Column(name="team_name")
	String team_name;
	int run_rate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getRun_rate() {
		return run_rate;
	}
	public void setRun_rate(int run_rate) {
		this.run_rate = run_rate;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team_name=" + team_name + ", run_rate=" + run_rate + "]";
	}
	
}
