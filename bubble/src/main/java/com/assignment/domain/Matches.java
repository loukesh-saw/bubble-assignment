package com.assignment.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class Matches implements Serializable{
	
	@Id
	int id;
	String team_name1;
	String team_name2;
	Date date_of_match;
	String venue;
	String team_name1_score;
	String team_name2_score;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam_name1() {
		return team_name1;
	}
	public void setTeam_name1(String team_name1) {
		this.team_name1 = team_name1;
	}
	public String getTeam_name2() {
		return team_name2;
	}
	public void setTeam_name2(String team_name2) {
		this.team_name2 = team_name2;
	}
	public Date getDate_of_match() {
		return date_of_match;
	}
	public void setDate_of_match(Date date_of_match) {
		this.date_of_match = date_of_match;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam_name1_score() {
		return team_name1_score;
	}
	public void setTeam_name1_score(String team_name1_score) {
		this.team_name1_score = team_name1_score;
	}
	public String getTeam_name2_score() {
		return team_name2_score;
	}
	public void setTeam_name2_score(String team_name2_score) {
		this.team_name2_score = team_name2_score;
	}
	@Override
	public String toString() {
		return "Matches [id=" + id + ", team_name1=" + team_name1 + ", team_name2=" + team_name2 + ", date_of_match="
				+ date_of_match + "]";
	}
	

}
