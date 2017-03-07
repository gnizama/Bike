package com.bike.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Motto entity. @author MyEclipse Persistence Tools
 */

public class Motto implements java.io.Serializable {

	// Fields

	private Integer mottoid;
	private String motto;
	private Set persons = new HashSet(0);

	// Constructors

	/** default constructor */
	public Motto() {
	}

	/** minimal constructor */
	public Motto(Integer mottoid, String motto) {
		this.mottoid = mottoid;
		this.motto = motto;
	}

	/** full constructor */
	public Motto(Integer mottoid, String motto, Set persons) {
		this.mottoid = mottoid;
		this.motto = motto;
		this.persons = persons;
	}

	// Property accessors

	public Integer getMottoid() {
		return this.mottoid;
	}

	public void setMottoid(Integer mottoid) {
		this.mottoid = mottoid;
	}

	public String getMotto() {
		return this.motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}