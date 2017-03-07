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
public class LoginDao {
	@Resource SessionFactory factory;
	
	public void AddPerson(Person person) throws Exception{
		Session s = factory.getCurrentSession();
		s.save(person);
	}
	
	/*查询所有Person信息*/
	public ArrayList<Person> QueryAllPerson(){
		Session s = factory.getCurrentSession();
		String hql = "from Person";
		Query q = s.createQuery(hql);
		List personList = q.list();
		return(ArrayList<Person>) personList;
	}
	
	public Person getPerson(String username){
		Session s = factory.getCurrentSession();
		String hql = " From Person person where person.username = '"+username+"' ";
		Query q = s.createQuery(hql);
		Person person= (Person) q.uniqueResult();
		return person;
	}
	
	/*根据逐渐获取对象*/
	public Person GetPersonById(Integer personid){
		Session s = factory.getCurrentSession();
		Person person = (Person)s.get(Person.class, personid);
		return person;
	}
	
}
