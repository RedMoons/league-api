package com.techprimers.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.domain.Team;

import com.techprimers.repository.EnglandLeagueRepository;

@RestController
@RequestMapping("/england")
public class EnglandLeagueController {

	@Autowired
	private EntityManager  englandLeagueEntityManager;
	

	private EnglandLeagueRepository englandLeagueRepository;
	
//	@GetMapping(value ="/teamInfo/{id}")
//	public String getTeamInfo(@PathVariable final Integer id) {
//		englandLeagueRepository = new JpaRepositoryFactory(englandLeagueEntityManager)
//				.getRepository(EnglandLeagueRepository.class);
//		return englandLeagueRepository.getEnglandLeagueTeamNameByTeamId(id);
//	}
	
	@GetMapping(value = "/all")
	public Iterable<Team> findAll() {
		englandLeagueRepository = new JpaRepositoryFactory(englandLeagueEntityManager)
		.getRepository(EnglandLeagueRepository.class);

		return englandLeagueRepository.findAll();
	}
	
	@GetMapping(value = "/{teamId}")
	public Team findByName(@PathVariable final Integer teamId) {
		englandLeagueRepository = new JpaRepositoryFactory(englandLeagueEntityManager)
		.getRepository(EnglandLeagueRepository.class);

		return englandLeagueRepository.findByTeamId(teamId);
	}
}
