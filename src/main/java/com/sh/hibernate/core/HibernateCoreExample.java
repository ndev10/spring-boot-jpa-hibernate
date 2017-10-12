package com.sh.hibernate.core;

import javax.persistence.EntityManager;

public class HibernateCoreExample {

	public static void main(String[] args) {
		 EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		    entityManager.getTransaction().begin();

		    // Check database version
		    String sql = "SELECT H2VERSION() FROM DUAL";

		    String result = (String) entityManager.createNativeQuery(sql).getSingleResult();
		    System.out.println(result);

		    entityManager.getTransaction().commit();
		    entityManager.close();

		    JPAUtil.shutdown();

	}

}
