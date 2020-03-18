package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class Launcher {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			// Student st = new Student("Tanmay", "Deshpande",
			// "tanmay.deshpande@cognizant.com");
			Student st = new Student("Scott", "Mctomminay", "scott.mct@cognizant.com");

			session.beginTransaction();

			session.save(st);

			session.getTransaction().commit();

			System.out.println("Entry added");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			factory.close();
		}

	}

}
