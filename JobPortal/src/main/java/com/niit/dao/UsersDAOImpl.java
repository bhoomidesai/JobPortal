package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Users;
@Transactional
@Repository("usersDAO")
public class UsersDAOImpl implements UsersDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void insertJob(Users user) {
		sessionFactory.getCurrentSession().persist(user);
		
	}

	public List<Users> getAllJobs() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from users").list();
	}


}
