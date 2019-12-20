package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;

	}
}
