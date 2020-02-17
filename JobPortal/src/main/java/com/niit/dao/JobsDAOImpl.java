package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Jobs;
@Transactional
@Repository("jobsDAO")
public class JobsDAOImpl implements JobsDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void insertJob(Jobs job) {
		sessionFactory.getCurrentSession().persist(job);
		
	}

	public List<Jobs> getAllJobs() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from jobs").list();
	}


}
