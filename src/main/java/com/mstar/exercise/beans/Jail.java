package com.mstar.exercise.beans;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.AUTO;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 	Your score: (YES is 1 point)
 *
 *	Has Name: YES
 *	Has Address: YES
 *	Has Type: NO
 *	Type is Enum: N/A
 *	Has Region: YES
 *	Region is Enum: YES
 *  Has Capacity: YES
 *  Has Officers: YES
 *  Correct Relationship w/ Officers: YES
 *  Has Inmates: YES
 *  Correct Relationship w/ Inmates: YES
 *  
 *  Remarks: The type of the Jail was specified in the first paragraph specifically, '...and operation of all district, city and municipal jails in the Philippines...'
 *  
 *  Final Score: 9 of 11
 *
 */

@Entity
public class Jail{

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	
	private String name;
	
	private String address;
	
	@Enumerated(STRING)
	@Column(name = "REGION")
	private Region region;
	
	private Integer capacity;
	
	@OneToMany(mappedBy="jail")
	private Collection<Officer> officers;
	
	@OneToMany(mappedBy="jail")
	private Collection<Inmate> inmates;	
	
	
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

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

	
	

}
