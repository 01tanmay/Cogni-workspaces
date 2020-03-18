package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class eagerVsLazy {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			/*
			 * Instructor instructor = new Instructor("Scott", "Mct", "scott@manutd.com");
			 * 
			 * InstructorDetail detail = new InstructorDetail("manutd.com", "Football");
			 */
			int myId = 4;

			session.beginTransaction();

			Instructor instructor = session.get(Instructor.class, myId);

			// Instructor instructor1 = session.load(Instructor.class, myId);

			System.out.println("Instructor: " + instructor);
			// System.out.println("Instructor1: " + instructor1);
//			System.out.println("COurses for that instructor: " + instructor.getCourses());

			session.getTransaction().commit();

			// session.close();

			System.out.println("Courses for that instructor: " + instructor.getCourses());

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			session.close();
			factory.close();
		}

	}

}
