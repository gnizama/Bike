package com.bike.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Bike entity. @author MyEclipse Persistence Tools
 */

public class Bike implements java.io.Serializable {

	// Fields

	private Integer bikeid;
	private String bikebrand;
	private Integer speed;
	private String biketype;
	private Set lines = new HashSet(0);
	private Set persons = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bike() {
	}

	/** minimal constructor */
	public Bike(Integer bikeid) {
		this.bikeid = bikeid;
	}

	/** full constructor */
	public Bike(Integer bikeid, String bikebrand, Integer speed,
			String biketype, Set lines, Set persons) {
		this.bikeid = bikeid;
		this.bikebrand = bikebrand;
		this.speed = speed;
		this.biketype = biketype;
		this.lines = lines;
		this.persons = persons;
	}

	// Property accessors

	public Integer getBikeid() {
		return this.bikeid;
	}

	public void setBikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}

	public String getBikebrand() {
		return this.bikebrand;
	}

	public void setBikebrand(String bikebrand) {
		this.bikebrand = bikebrand;
	}

	public Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getBiketype() {
		return this.biketype;
	}

	public void setBiketype(String biketype) {
		this.biketype = biketype;
	}

	public Set getLines() {
		return this.lines;
	}

	public void setLines(Set lines) {
		this.lines = lines;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}