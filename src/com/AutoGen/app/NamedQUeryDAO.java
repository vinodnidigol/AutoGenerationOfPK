package com.AutoGen.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NamedQUeryDAO {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("configuration.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session sess=sf.openSession();
		
		// get the Query from DTO class
		
		Query qry=sess.getNamedQuery("getByNoOfOrders");
		qry.setParameter("noOrders", 1);
		//process the result
		DominosDTO dominos=(DominosDTO)qry.uniqueResult();
		System.out.println(dominos.getBranch());
		
		
		
		
	}
}
