package com.AutoGen.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonSessionFactory;

public class NamedQueryWithSingleton {
	
	public static void main(String[] args) {
		
		// obtain a session
SessionFactory sf=SingleTonSessionFactory.getSf();
			
		Session sess=sf.openSession();
		
		Query qry=sess.getNamedQuery("getByNoOfOrders");
		qry.setParameter("branch", "Basavanagudi");
		DominosDTO dominos=(DominosDTO)qry.uniqueResult();
		System.out.println(dominos.getContactno());
		
		
		
		
		
		
		
		
	}
}
