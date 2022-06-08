package com.ty.PersonPanuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.AddressBranch.Address;
import com.ty.AddressBranch.Branch;

public class TestPersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Address address = new Address();
		address.setStreet("19 D Cross");
		address.setLandmark("2nd cross, BTM Layout");
		address.setDistrict("Bangalore");
		address.setState("Karnataka");
		address.setPincode("5670021");

		Branch branch = new Branch();
		branch.setName("BTM");
		branch.setState("Karnataka");
		branch.setCountry("India");
		branch.setPhone(34567890l);

		branch.setAddress(address);

		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}

}
