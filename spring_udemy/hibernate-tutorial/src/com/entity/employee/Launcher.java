package com.entity.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Launcher {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			Employee emp = new Employee("Tanmay", "Deshpande", "tanmay.deshpande@cognizant.com");

			Employee emp1 = new Employee("Scott", "McT", "scot@gmail.com");

			session.save(emp);

			session.save(emp1);

			session.getTransaction().commit();

			System.out.println("Entry Added");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
