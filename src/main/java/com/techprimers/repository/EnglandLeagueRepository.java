package com.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techprimers.domain.Team;


@Repository
public interface EnglandLeagueRepository extends CrudRepository<Team, Long>{
	
	Team findByTeamId(Integer teamId);


//	@Query("select teamName from england_league where teamId = ?1")
//	String getEnglandLeagueTeamNameByTeamId(Integer teamId);

}
