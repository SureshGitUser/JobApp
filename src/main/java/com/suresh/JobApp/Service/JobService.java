package com.suresh.JobApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.JobApp.Repo.JobRepository;
import com.suresh.JobApp.model.JobPost;


@Service
public class JobService {
	
	
	@Autowired
	JobRepository jobRepository;
	
	
	//here job object is called DTO(dat transfer Object) because it is passing through several layers 

	public void addJob(JobPost job)
	
	{
		jobRepository.addJob(job);
	}
	
	
	public List<JobPost> getAllJobs()
	
	{
		return jobRepository.getAllJobs();
	}

}
