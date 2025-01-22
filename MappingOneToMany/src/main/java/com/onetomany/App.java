package com.onetomany;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Entity.Employee;
import com.onetomany.Entity.Projects;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cf = new Configuration();
		cf.configure();
		org.hibernate.SessionFactory sf = cf.buildSessionFactory();
		org.hibernate.Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// Employee Class Object

		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("Pooja");
		emp.setEsalary(50000);

		Projects project1 = new Projects();
		project1.setPid(101);
		project1.setProjname("Hospital Management System");
		project1.setProjtye("EE");
		project1.setProcjlient("Riya");
		project1.setE1(emp);

		Projects project2 = new Projects();
		project2.setPid(102);
		project2.setProjname("Bank Management System");
		project2.setProjtye("STD");
		project2.setProcjlient("piya");
		project2.setE1(emp);

		

		

		Employee emp1 = new Employee();
		emp1.setEid(2);
		emp1.setEname("Poonam");
		emp1.setEsalary(60000);

		Projects project3 = new Projects();
		project3.setPid(104);
		project3.setProjname("Electricity Management System");
		project3.setProjtye("EE");
		project3.setProcjlient("Mona");
		project3.setE1(emp1);

		Projects project4 = new Projects();
		project4.setPid(105);
		project4.setProjname("Vehicle Management System");
		project4.setProjtye("STD");
		project4.setProcjlient("Kisan");
		project4.setE1(emp1);

		Projects project5 = new Projects();
		project5.setPid(107);
		project5.setProjname("Employee Management System");
		project5.setProjtye("STD");
		project5.setProcjlient("Kunal");
		project5.setE1(emp1);

		
//    // creating List Of Projects
		List<Projects> list1 = new LinkedList<Projects>();
		list1.add(project1);
		list1.add(project2);
		

		
		emp.setProject(list1);
		session.save(emp);
		session.save(project1);
		session.save(project2);
		
//creating 2 list of projects
		List<Projects> list2 = new LinkedList<Projects>();
		list2.add(project3);
		list2.add(project4);
		list2.add(project5);
		
		emp1.setProject(list2);
		session.save(emp1);
		session.save(project3);
		session.save(project4);
		session.save(project5);

		System.out.println("End");

		tx.commit();
		session.close();
		sf.close();

	}
}
