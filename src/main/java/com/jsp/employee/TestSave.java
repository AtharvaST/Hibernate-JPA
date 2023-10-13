package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Atharva");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("sachin");
		employee.setEmail("lappu@mail.com");
		employee.setCno(1234567893);
		
	
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		

	}

}
