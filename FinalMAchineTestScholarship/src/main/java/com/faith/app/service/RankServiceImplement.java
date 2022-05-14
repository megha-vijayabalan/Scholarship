package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IRankingRepository;

import com.faith.app.entity.Ranking;
@Service
public class RankServiceImplement implements IRankingService {
	
	
	@Autowired
	private IRankingRepository rankingRepo;
	

	@Override
	public List<Ranking> getAllRanking() {
		 
		return (List<Ranking>)	rankingRepo.findAll();
	}

	@Override
	public void saveRanking(Ranking ranking) {
		rankingRepo.save(ranking);

	}

	@Override
	public Optional<Ranking> getRanking(int theId) {
		 
		return rankingRepo.findById(theId);
	}

	@Override
	public void deleteRanking(int theId) {
		 
		rankingRepo.deleteById(theId);
	}

}
