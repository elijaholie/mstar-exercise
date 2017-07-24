package com.mstar.exercise.beans;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.TemporalType.DATE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "INMATE")
public class Inmate {

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "INMATE_ID")
	private Long id;
	
	@Column(name = "CONTROL_NUMBER", unique = true)
	private String controlNumber;
	
	@Enumerated(STRING)
	@Column(name = "TYPE")
	private InmateType type;
	
	@Temporal(DATE)
	@Column(name = "COMMITMENT_DATE", nullable = false)
	private Date commitmentDate;
	
	@OneToOne(mappedBy = "trustee")
	private Officer officer;
	
	@ManyToOne
	@JoinColumn(name = "JAIL_ID")
	private Jail jail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public InmateType getType() {
		return type;
	}

	public void setType(InmateType type) {
		this.type = type;
	}

	public Date getCommitmentDate() {
		return commitmentDate;
	}

	public void setCommitmentDate(Date commitmentDate) {
		this.commitmentDate = commitmentDate;
	}

	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}

	public Jail getJail() {
		return jail;
	}

	public void setJail(Jail jail) {
		this.jail = jail;
	}
	
	
	
}
