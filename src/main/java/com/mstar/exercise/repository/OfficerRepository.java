package com.mstar.exercise.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mstar.exercise.beans.Inmate;
import com.mstar.exercise.beans.Officer;

public interface OfficerRepository extends CrudRepository<Officer, Long> {
	
	public List<Inmate> findByRankAndName(String rank, String name);
	
}
