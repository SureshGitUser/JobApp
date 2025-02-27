package com.suresh.JobApp.Repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.suresh.JobApp.model.JobPost;


@Repository
public class JobRepository {
	
	
	
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
		    new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
		        Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),
		    new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
		        Arrays.asList("HTML", "CSS", "JavaScript", "React")),
		    new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
		        Arrays.asList("Python", "Machine Learning", "Data Analysis")),
		    new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
		        Arrays.asList("Networking", "Cisco", "Routing", "Switching"))
		));


	       
public List<JobPost> getAllJobs()
	
	{
		
	return jobs;
	}


public void addJob(JobPost job)
{
	jobs.add(job);
}
	
    
	
}
