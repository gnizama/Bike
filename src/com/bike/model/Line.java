package com.bike.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Line entity. @author MyEclipse Persistence Tools
 */

public class Line implements java.io.Serializable {

	// Fields

	private Integer lineid;
	private Bike bike;
	private Integer length;
	private String difficulty;
	private Set persons = new HashSet(0);

	// Constructors

	/** default constructor */
	public Line() {
	}

	/** minimal constructor */
	public Line(Integer lineid) {
		this.lineid = lineid;
	}

	/** full constructor */
	public Line(Integer lineid, Bike bike, Integer length, String difficulty,
			Set persons) {
		this.lineid = lineid;
		this.bike = bike;
		this.length = length;
		this.difficulty = difficulty;
		this.persons = persons;
	}

	// Property accessors

	public Integer getLineid() {
		return this.lineid;
	}

	public void setLineid(Integer lineid) {
		this.lineid = lineid;
	}

	public Bike getBike() {
		return this.bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}