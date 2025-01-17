package com.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Project start");
        System.out.println("Step 1");

        // Step 2: Configure Hibernate
        Configuration cfg = new Configuration();
        System.out.println("Step 2");
        cfg.configure();

        System.out.println("Step 3");
        SessionFactory sf = cfg.buildSessionFactory();

        System.out.println("Step 4");
        Session session = sf.openSession();

        // Begin Transaction
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            // Create Student Object
            Student stu1 = new Student();
            stu1.setSid(102);
            stu1.setSname("Mihika");
            stu1.setMarks(98);

            // Create a List of Students
            List<Student> l1 = new ArrayList<Student>();
            l1.add(new Student(103, "Poonam", 86));
            l1.add(new Student(104, "Pooja", 89));
            l1.add(new Student(105, "Prachi", 66));
            l1.add(new Student(106, "Pratiksha", 76));
            l1.add(new Student(107, "Priya", 50));

            // Save Student Objects
            for (Student student : l1) {
//                session.save(student);
            }
//            update
            Student st=session.get(Student.class,2);
            System.out.println("Student");
            st.setSname("Ram");
//            session.update(st);
            // Delete
            Student  s=session.get(Student.class, 1);
            session.delete(s);
            System.out.println(" Deleting the record");
            
            

            // Commit Transaction
            transaction.commit();
            System.out.println("Student saved successfully!");
            

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close Session and SessionFactory
            session.close();
            sf.close();
            System.out.println("END");
        }
    }
}
