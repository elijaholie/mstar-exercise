package com.mstar.exercise.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mstar.exercise.beans.Jail;

public interface JailRepository extends CrudRepository<Jail, Long> {

	public List<Jail> findByName(String name);
	
}
