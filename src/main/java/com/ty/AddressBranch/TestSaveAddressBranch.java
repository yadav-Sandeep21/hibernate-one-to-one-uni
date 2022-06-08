package com.ty.AddressBranch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.PersonPanuni.Pan;
import com.ty.PersonPanuni.Person;

public class TestSaveAddressBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Sandeep");
		person.setEmail("sandeep@gmail.com");
		person.setPhone(234567890l);
		
		Pan pan=new Pan();
		pan.setAddress("BTM Layout,Bangalore");
		pan.setPanNumber("S123TY");
		
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
