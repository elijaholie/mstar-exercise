package com.mstar.exercise.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mstar.exercise.beans.Inmate;

public interface InmateRepository extends CrudRepository<Inmate, Long> {

	public List<Inmate> findByControlNumber(String controlNumber);
	
}
