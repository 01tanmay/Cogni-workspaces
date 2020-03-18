package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DelLauncher2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			int myInstructorDet = 2;

			session.beginTransaction();

			InstructorDetail toDel = session.get(InstructorDetail.class, myInstructorDet);

			if (toDel != null)
				session.delete(toDel);

			session.getTransaction().commit();

			System.out.println("Entry Deleted");

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			session.close();
			factory.close();

		}

	}

}
