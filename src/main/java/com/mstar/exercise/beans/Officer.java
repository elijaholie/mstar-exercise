package com.mstar.exercise.beans;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mstar.exercise.json.InmateJsonDeserializer;
import com.mstar.exercise.json.JailJsonDeserializer;

@Entity
public class Officer {

	@Id
	@GeneratedValue(strategy = AUTO)
	private long id;
	
	private String name;
	
	private String rank;

	@ManyToOne
	@JsonDeserialize(using = JailJsonDeserializer.class)
	@JoinColumn(name = "JAIL_ID")
	private Jail jail;

	@OneToOne
	@JsonDeserialize(using = InmateJsonDeserializer.class)
	@JoinColumn(name = "TRUSTEE_ID")
	private Inmate trustee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Jail getJail() {
		return jail;
	}

	public void setJail(Jail jail) {
		this.jail = jail;
	}

	public Inmate getTrustee() {
		return trustee;
	}

	public void setTrustee(Inmate trustee) {
		this.trustee = trustee;
	}
	
	
}
