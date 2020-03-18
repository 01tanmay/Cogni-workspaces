package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class CreateLauncher {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Instructor instructor = new Instructor("Tanmay", "Deshpande", "Tanmay.Deshpande@gmail.com");

			InstructorDetail instructorDetail = new InstructorDetail("01tanmay", "Earning");

			// associate objects
			instructor.setInstructorDetail(instructorDetail);

			session.beginTransaction();

			session.save(instructor);

			session.getTransaction().commit();

			System.out.println("Saved Instructor: " + instructor);

			System.out.println("Saved Instructor Detail: " + instructorDetail);

			System.out.println("Entry Added");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
