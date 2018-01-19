package com.AutoGen.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DynamicHQLDAO {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		
		config.configure("configuration.xml");
		
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session sess=sf.openSession();
		
	/*	
		//step 1 create the query
		
		String hql="from DominosDTO where noOforders=? and branch=?";
		
		Query qry=sess.createQuery(hql);
		
		qry.setInteger(0, 2);
		qry.setString(1, "Basavanagudi");
		
		
		//step 2 process the result
		
		
		DominosDTO dominos=(DominosDTO)qry.uniqueResult();
		
		System.out.println(dominos.getContactno());
		*/
		
		
		
		//HQL using named queries
		
	/*	String hql="from DominosDTO"
				+ " where noOforders=:"
				+ "noOrders and branch=:branch";
		Query qry=sess.createQuery(hql);
		qry.setParameter("noOrders", 2);
		qry.setParameter("branch", "Basavanagudi");
		
DominosDTO dominos=(DominosDTO)qry.uniqueResult();
		
		System.out.println(dominos.getContactno());*/
		
		
		
		
		String hql="select branch,contactno from DominosDTO ";
		
		Query qry=sess.createQuery(hql);
		
		List<Object[]> dominos=qry.list();
		for (Object[] objects : dominos) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			
			System.out.println("----------------------");
		}
		
		
		
		
	}
}
