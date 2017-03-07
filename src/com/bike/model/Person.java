package com.bike.model;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer personid;
	private Motto motto;
	private Line line;
	private Bike bike;
	private String name;
	private String password;
	private String username;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(Integer personid) {
		this.personid = personid;
	}

	/** full constructor */
	public Person(Integer personid, Motto motto, Line line, Bike bike,
			String name, String password, String username) {
		this.personid = personid;
		this.motto = motto;
		this.line = line;
		this.bike = bike;
		this.name = name;
		this.password = password;
		this.username = username;
	}

	// Property accessors

	public Integer getPersonid() {
		return this.personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public Motto getMotto() {
		return this.motto;
	}

	public void setMotto(Motto motto) {
		this.motto = motto;
	}

	public Line getLine() {
		return this.line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public Bike getBike() {
		return this.bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}