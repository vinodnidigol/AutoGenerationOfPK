package com.AutoGen.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DominosDAO {
public static void main(String[] args) {
	
	
	DominosDTO dominos=new DominosDTO();
	dominos.setBranch("Basavanagudi");
	dominos.setContactno(8886886);

	
	Configuration config= new Configuration();
	config.configure("configuration.xml");
	SessionFactory sf=config.buildSessionFactory();
	
	Session sess=sf.openSession();
	
	sess.save(dominos);
	
	sess.beginTransaction().commit();
	
}
}
