package com.luv2code.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			int studentId = 2;

			session = factory.getCurrentSession();
			session.beginTransaction();

			Student student = session.get(Student.class, studentId);

			student.setFirstName("Paul");

			session.getTransaction().commit();

			// New Code

			session = factory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("update Student set email='abc@gmail.com'").executeUpdate();

			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			factory.close();
		}

	}

}
