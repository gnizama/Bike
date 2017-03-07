package com.bike.dao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.bike.model.*;

@Service @Transactional
public class BikeDao {
	@Resource SessionFactory factory;
	
	 public void addBike(Bike bike) throws Exception {
	    	Session s = factory.getCurrentSession();
	    	s.save(bike);
	    }
	 public void deleteBike (int Bikeid) throws Exception {
	        Session s = factory.getCurrentSession(); 
	        Object Bike = s.load(Bike.class, Bikeid);//load�����ķ���ֵΪObject
	        s.delete(Bike);
	    }
	 public void updateBike(Bike Bike) throws Exception {
	        Session s = factory.getCurrentSession();
	        s.update(Bike);
	    }
	    public Bike getBikeById(int bikeid) {
	        Session s = factory.getCurrentSession();
	        Bike bike= (Bike)s.get(Bike.class, bikeid);
	        return bike;
	    }
	    public ArrayList<Bike> getAllBikes() {
	        Session s = factory.getCurrentSession();
	        String hql = "From Bike";
	        Query q = s.createQuery(hql);
	        List bikelist = q.list();
	        return (ArrayList<Bike>) bikelist;
	    }
	    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	    public ArrayList<Bike> QueryBikeInfo(String biketype) { 
	    	Session s = factory.getCurrentSession();
	    	String hql = "From Bike Bike where 1=1";
	    	if(!biketype.equals("")) hql = hql + " and Bike.biketype like '%" + biketype + "%'";
	    	Query q = s.createQuery(hql);
	    	List bikelist = q.list();
	    	return (ArrayList<Bike>) bikelist;
	    }

	
	
	
}
