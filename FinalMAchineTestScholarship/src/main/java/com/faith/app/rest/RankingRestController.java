package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Ranking;
import com.faith.app.service.IRankingService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class RankingRestController {
	
	@Autowired
	private IRankingService rankingService;
	
	
	
	@GetMapping("/ranks")
	public List<Ranking> getAllRanking(){
		
		return rankingService.getAllRanking();
		
	}

	//Get Employee By Id
	@GetMapping("/ranks/{theId}")
	public Optional<Ranking> getRank(@PathVariable int theId) {
		
		return rankingService.getRanking(theId);
		
	}
	
	
		//Add Employee
		@PostMapping("/ranks")
		public void addRanking(@RequestBody Ranking ranking) {
			rankingService.saveRanking(ranking);
		}
		
		//Update Employee
		@PutMapping("/ranks")
		public void updateRanking(@RequestBody Ranking ranking) {
			rankingService.saveRanking(ranking);
			
		}
		
		//Delete Employee
		@DeleteMapping("/ranks/{theId}")
		public void deleteRanking(@PathVariable int theId) {
			rankingService.deleteRanking(theId);
		}
}
