package com.Anno;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Starting" );
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        // insertionn
        
        Vehicle v =new Vehicle();
        v.setId(1);
        v.setName("Nexon");
        v.setMilage(12);
        v.setPrice(8.6);
        v.setX(4512);
        v.setDate(new Date());
        FileInputStream fis=new FileInputStream("src/main/java/oop.png");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        v.setImg(b);
        se.save(v);
        
        tx.commit();
        se.close();
        sf.close();
        
        
    }
}
