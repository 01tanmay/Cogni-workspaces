package com.luv2code.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			List<Student> students = session.createQuery("from Student").getResultList();

			List<Student> formattedStudents = session.createQuery("from Student s where s.lastName='Deshpande'")
					.getResultList();

			students.forEach(s -> System.out.println(s));

			formattedStudents.forEach(s -> System.out.println(s));

			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			factory.close();
		}

	}

}
