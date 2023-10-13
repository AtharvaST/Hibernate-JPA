package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Atharva");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, 2);
		employee.setEmail("sonu@mail.com"); //Value to be updated......it is deleting check!!
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
		

	}

}
