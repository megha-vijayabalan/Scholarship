package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Ranking;
@Repository
public interface IRankingRepository  extends CrudRepository<Ranking, Integer> {

}
