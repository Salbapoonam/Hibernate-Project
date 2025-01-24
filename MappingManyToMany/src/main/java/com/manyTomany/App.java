package com.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manyTomany.Entity.Actors;
import com.manyTomany.Entity.Movies;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Start.." );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
//        movies object
        Movies m1=new Movies();
        m1.setMid(1);
        m1.setMnane("Puspha");
        m1.setBoxoffice(1.5);
        
        Movies m2=new Movies();
        m2.setMid(2);
        m2.setMnane("RRR");
        m2.setBoxoffice(655);
        
        Movies m3=new Movies();
        m3.setMid(3);
        m3.setMnane("Son Of Satymurti");
        m3.setBoxoffice(8.5);
        
//        actors
        
        Actors a1=new Actors();
        a1.setAid(101);
        a1.setAname("Allu Arjun");
        
        Actors a2=new Actors();
        a2.setAid(102);
        a2.setAname("Ram Charan");
        
        //list Of Movies
        List<Movies>lom=new ArrayList<Movies>();
        lom.add(m1);
        lom.add(m2);
        lom.add(m3);
        
        //List of Actor 
        List<Actors>loa=new ArrayList<Actors>();
        loa.add(a1);
        loa.add(a2);
        
        a1.setMovie(lom);
        a2.setMovie(lom);
        
        m1.setActors(loa);
        m2.setActors(loa);
        m3.setActors(loa);
        
        se.save(m1);
        se.save(m2);
        se.save(m3);
        se.save(a1);
        se.save(a2);
        
        
        
        tx.commit();
        se.close();
        sf.close();
        System.out.println("End of Program");
        
    }
}
