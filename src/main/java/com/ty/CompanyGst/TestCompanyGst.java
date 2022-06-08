package com.ty.CompanyGst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGst {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("Broadridge");
		company.setPhone(23456789l);
		company.setWeb("iKare");
		
		Gst gst=new Gst();
		gst.setGstNumber(21.2);
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
