package com.mstar.exercise.beans;

import static javax.persistence.GenerationType.AUTO;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jail{

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	
	private String name;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Collection<Officer> getOfficers() {
		return officers;
	}

	public void setOfficers(Collection<Officer> officers) {
		this.officers = officers;
	}

	public Collection<Inmate> getInmates() {
		return inmates;
	}

	public void setInmates(Collection<Inmate> inmates) {
		this.inmates = inmates;
	}

	private String address;
	
	private Integer capacity;
	
	@OneToMany(mappedBy="jail")
	private Collection<Officer> officers;
	
	@OneToMany(mappedBy="jail")
	private Collection<Inmate> inmates;	
	
	

}
