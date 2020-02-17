package com.niit.dao;

import java.util.List;

import com.niit.model.Jobs;

public interface JobsDAO {

	void insertJob(Jobs job);
	public List<Jobs> getAllJobs();

}
