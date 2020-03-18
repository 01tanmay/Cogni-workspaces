package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class CreateCourseDemo2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			Integer myInstructor = 4;

			session.beginTransaction();

			Instructor instructor = session.get(Instructor.class, myInstructor);

			Course course1 = new Course("Mngo");

			Course course2 = new Course("JPA");

			instructor.add(course1);
			instructor.add(course2);

			session.save(course1);
			session.save(course2);

			/* session.save(instructor); */

			session.getTransaction().commit();

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			session.close();
			factory.close();
		}

	}

}
