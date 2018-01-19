package com.AutoGen.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLDAO {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		
		config.configure("configuration.xml");
		
		config.addAnnotatedClass(DominosDTO.class);
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session session=sf.openSession();
		
		//use hql
		
		//step1 create the query
		//sql query
		//session.createQuery("select * from dominos_table where noOfOrders=2");
		//hql Query
		
	/*	String hql="from DominosDTO where noOforders=2";
		Query qry=session.createQuery(hql);
		
		//step 2 process the result
		DominosDTO dominos=	(DominosDTO)qry.uniqueResult();
		System.out.println(dominos.getBranch());
		System.out.println(dominos.getContactno());
		System.out.println(dominos.getNoOforders());*/
	
		
	/*	
		// To load all the records from the DB
		String hql="from DominosDTO";
		Query qry=session.createQuery(hql);
		
		//process the result
		List<DominosDTO> dominos=qry.list();
		
		for (DominosDTO dominosDTO : dominos) {
			System.out.println(dominosDTO.getNoOforders());
			System.out.println(dominosDTO.getBranch());
			System.out.println(dominosDTO.getContactno());
			System.out.println("--------------------");
		}*/
		
		
		/*
		// to select a single column from the DB
	String hql="select branch from DominosDTO "
			+ "where noOforders=2";
	Query qry=session.createQuery(hql);
	//process the result
	
	String branch=(String)qry.uniqueResult();
	
	
	System.out.println(branch);*/
	
		
		// to select multiple records from db
		String hql="select branch,contactno from DominosDTO "
				+ "where noOforders=2";
		
		Query qry=session.createQuery(hql);
		Object[] value=(Object[])qry.uniqueResult();
		System.out.println(value[0]);
		System.out.println(value[1]);
		
		
		
		
		
		
	}
	
}
