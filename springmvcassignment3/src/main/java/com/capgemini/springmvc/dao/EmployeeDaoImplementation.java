package com.capgemini.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.sprinmvc.bean.EmployeePrimaryInfo;
@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeePrimaryInfo auth(int id, String password) {
		EntityManager manager = factory.createEntityManager();

		String jpql = "select e from EmployeePrimaryInfo e where e.id=:id and e.password =:password";
		TypedQuery<EmployeePrimaryInfo> query =manager.createQuery(jpql,EmployeePrimaryInfo.class);
		query.setParameter("id",id );
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo emp) {

		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			String jpql="update EmployeePrimaryInfo m set m.name=:name,m.email=:email,m.deptId=:deptId,m.mobileno=:mobileno,m.salary=:salary,m.joiningDate=:joiningDate where m.id=:id";
			Query query=manager.createQuery(jpql);
			query.setParameter("name", emp.getName());
			query.setParameter("id", emp.getId());
			query.setParameter("email", emp.getEmail());
			query.setParameter("deptId", emp.getDeptId());
			query.setParameter("mobileno", emp.getMobileno());

			query.setParameter("salary", emp.getSalary());

			query.setParameter("joiningDate", emp.getJoiningDate());

			int m=query.executeUpdate();
			//	emp.setId(id);

			transaction.commit();
			isUpdated=true;
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return isUpdated;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {

		boolean isDeleted =false;
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo empInfo = manager.find(EmployeePrimaryInfo.class, id);

		if(empInfo !=null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(empInfo);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo emp) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			isAdded=true;
			System.out.println("Added");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public List<EmployeePrimaryInfo> getAllEmployeeInfo() {

		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from EmployeePrimaryInfo e";
		Query query =manager.createQuery(jpql);
		List<EmployeePrimaryInfo> emplist= query.getResultList();

		manager.close();

		return emplist;
	}

	@Override
	public EmployeePrimaryInfo getEmployeeInfo(int id) {

		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo empInfo = manager.find(EmployeePrimaryInfo.class, id);

		manager.close();

		return empInfo;
	}

}
