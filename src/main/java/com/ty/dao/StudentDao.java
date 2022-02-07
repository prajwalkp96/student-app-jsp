package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;


public class StudentDao {

	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	private EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveStudent(Student student) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public List<Student> getAllStudents() {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("select s from Student s ");
		entityTransaction.commit();
		return query.getResultList();
	}

	public Student getStudentById(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		return entityManager.find(Student.class, id);
	}

	public void updateStudent(Student student) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}

	public boolean deleteStudent(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);
		if(student!= null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
	}
}
