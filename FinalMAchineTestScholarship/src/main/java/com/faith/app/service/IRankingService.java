package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Ranking;

public interface IRankingService {
	
	
	//List
			public List<Ranking> getAllRanking();
			//Insert/Update
			
			public void saveRanking(Ranking ranking);
			
			//Search By Id
			public Optional<Ranking> getRanking(int theId);
			
			
			
			//Delete
			public void deleteRanking(int theId);

}
