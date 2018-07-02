package com.arati.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
public static SessionFactory factory=null;
private HibernateUtil()
{
	System.out.println(this.getClass().getSimpleName()+"is created..");
	
	
}
public static SessionFactory getSessionFactory()
{
	if(factory==null)
		factory=new Configuration().configure().buildSessionFactory();
	return factory;
}
}
