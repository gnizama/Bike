package com.bike.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import com.bike.dao.*;
import com.bike.model.*;
@Controller @Scope("prototype")

public class LoginAction extends ActionSupport {

	@Resource  LoginDao loginDao;
	private String username;
	private String password;
	private String message;
	private String name;

	
	public String register(){
		Person person = new Person(1);
		person.setUsername(username);
		person.setPassword(password);
		person.setName(name);
		try {
			loginDao.AddPerson(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String execute(){
		Person person=loginDao.getPerson(username);
		if(person==null){
			message="用户名不存在";
			return INPUT;
		}
		if(!person.getPassword().equals(password)){
			message="password error";
			return INPUT;
		}
		return SUCCESS;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
