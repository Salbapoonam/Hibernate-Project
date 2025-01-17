package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.Entity.Employe;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Staring" );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        // insertionn
        Employe e1=new Employe();
        e1.setSid(1);
        e1.setSname("Poonam");
        e1.setSalary(123350.23);
        se.save(e1);
        
//        updation
        
       Employe e8= se.get(Employe.class,1 );
       e8.setSname("Pooja");
//       se.update(e8);
       
//        deletion
       
       Employe e3= se.get(Employe.class,1 );
       e3.setSname("Pooja");
//       se.delete(e3);

       
       Employe e = se.get(Employe.class, 1); 
       System.out.println("Employee ID: " + e.getSid());
       System.out.println("Employee Name: " + e.getSname()); 
       System.out.println("Employee Salary: " + e.getSalary());
       
       
       
        
        
        
        tx.commit();
        se.close();
        sf.close();
    }
}
