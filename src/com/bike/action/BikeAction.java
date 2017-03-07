package com.bike.action;
import java.util.*;
import java.io.*;

import org.apache.commons.collections.list.LazyList;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bike.dao.BikeDao;
import com.bike.model.Bike;
import com.bike.dao.BikeDao;
import com.bike.model.Bike;
import com.opensymphony.xwork2.ActionSupport;//struts2锟结供锟斤拷锟斤拷锟截ｏ拷校锟斤拷裙锟斤拷堋锟�

import javax.annotation.Resource;
@Controller @Scope("prototype")
public class BikeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource  BikeDao bikeDao;
	private List<Bike> bikelist;
	private Bike bike;
	private  String keywords;
	
	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<Bike> getBikelist() {
		return bikelist;
	}

	public void setBikelist(List<Bike> bikelist) {
		this.bikelist = bikelist;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public String addBike() throws Exception {
		bikeDao.addBike(bike);
		return"message";
	}
	 /*public String deleteBike()throws Exception{
		 System.out.print(Bike.getBikeid());
		 BikeDao.deleteBike(Bike.getBikeid());
		 return "sucdelete";
	 }*/
	 public String getAllBikes(){
	  bikelist=bikeDao.getAllBikes();
		return "getAllBikes";
		
	 }
	 public String showDetail(){
		 bike=bikeDao.getBikeById(bike.getBikeid());
		 return "detail_view";
	 }
	 
	 public String editBike() throws Exception{
		 bikeDao.updateBike(bike);
		 return "edit_message";
	 }
	 public String deleteBike() throws Exception{
		 bikeDao.deleteBike(bike.getBikeid());
		 return "delete_message";
	 }
	 public String queryBikes() throws Exception{
		 bikelist=bikeDao.QueryBikeInfo(keywords);
		 return "show_view";
	 }
     public String showEdit() throws Exception{
    	 bike=bikeDao.getBikeById(bike.getBikeid());
    	 return "edit";
     }
	 
       


}
