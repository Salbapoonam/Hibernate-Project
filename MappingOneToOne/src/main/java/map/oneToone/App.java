package map.oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import map.oneToone.Entity.Address;
import map.oneToone.Entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

//      Student Object
		Student st = new Student();
		st.setSid(2);
		st.setSname("Poonam");
		// Addres object
		Address add = new Address();
		add.setArea("Shivajinagar");
		add.setPincode(102);
		add.setColonyName("Happinest");

		st.setAdd(add);
//		se.save(add);
//		se.save(st);

//    Student Object
		Student st1 = new Student();
		st1.setSid(3);
		st1.setSname("Pratiksha");
		// Addres object
		Address add1 = new Address();
		add1.setArea("Pnagar");
		add1.setPincode(103);
		add1.setColonyName("Aandi");
		st1.setAdd(add1);
//		se.save(add1);
//		se.save(st1);

//  Student Object
		Student st2 = new Student();
		st2.setSid(3);
		st2.setSname("Prachi");
		// Addres object
		Address add2 = new Address();
		add2.setArea("pune");
		add2.setPincode(105);
		add2.setColonyName("vikas");
		st2.setAdd(add2);
//		se.save(add2);
//		se.save(st2);

//Student Object
		Student st3 = new Student();
		st3.setSid(5);
		st3.setSname("Pradnya");
// Addres object
		Address add3 = new Address();
		add3.setArea("Hinjewadi");
		add3.setPincode(108);
		add3.setColonyName("GUruprasad");

		st3.setAdd(add3);
//		se.save(add3);
//		se.save(st3);

		// Updation of Data

		Student up = se.get(Student.class, 1);
		// up.setSname("Pooja");
//		se.save(up);

		// Deletion Of Data;
		Student del = se.get(Student.class, 1);
//	   se.delete(del);

		// Displaying Single Records
		Student sc = se.get(Student.class, 2);
		if (sc != null) {
			System.out.println("Student ID: " + sc.getSid());
			System.out.println("Student Name: " + sc.getSname());
			System.out.println("Student Address: " + sc.getAdd());
		} else {
			System.out.println("No record found with ID 2");
		}

		tx.commit();
		se.close();

		sf.close();
		System.out.println("End");

		//

	}
}
