package com.techprimers.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "england_league")
public class Team {
	
	@Id
	@GeneratedValue
	@Column(name = "team_id")
	private Integer teamId;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "team_score")
	private Integer teamScore;
	
	@Column(name = "time_stamp")
	private Date timeStamp;
	
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getTeamScore() {
		return teamScore;
	}
	public void setTeamScore(Integer teamScore) {
		this.teamScore = teamScore;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	


}
