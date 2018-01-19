package com.AutoGen.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class loadGETDIff {

	public static void main(String[] args) {
		Configuration config= new Configuration();
		config.configure("configuration.xml");
		SessionFactory sf=config.buildSessionFactory();
		
		Session sess=sf.openSession();
		
		
		//load to load the data from DB
		DominosDTO dominos=sess.get(DominosDTO.class, 1);
		
		
		
		
	}
	
}
