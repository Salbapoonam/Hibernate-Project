package com.Embbeded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
public static void main(String[] args) {
	
	System.out.println( "Project Starting" );
    
    Configuration cfg=new Configuration();
    cfg.configure();
    SessionFactory sf=cfg.buildSessionFactory();
    Session se=sf.openSession();
    Transaction tx=se.beginTransaction();
    
    Student s1=new Student();
    s1.setId(0);
    s1.setName("Poonam Salbande");
    Courses c=new Courses();
    c.setCname("Python Full Stack");
    c.setFees(50000);
    s1.setCourse(c);
    se.save(s1);
    tx.commit();
    se.close();
    sf.close();
    
    
}
}
