package com.niit.dao;



import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Job;
import com.niit.dao.JobDao;
import com.niit.dao.JobDaoImpl;

public class JobDAOTest 
{
	@BeforeClass	
	  public static void initialize()
	  {
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class);
		  context.scan("com.niit");
		  JobDao ja=(JobDao)context.getBean("jobDAO");
		  //context.refresh();
		  Job job=new Job();
		  //job.setJobId(1);
		  job.setPostedOn(new Date());
		  job.setJobTitle("Trainee");
		  job.setJobContent("Software Trainee");
		  job.setSalary(20000.00);
		  job.setLocation("Chennai");
		  job.setCompanyName("ABC & Co.");
		  job.setYrsOfExp("Fresh");
		  job.setStatus("A");
		  job.setUsername("Anitha");
		  ja.addJob(job);
		  System.out.println("Data inserted successfully");
	  }
	  @Test
	  public void test()
	  {
		  fail("Not yet implemented");
	  }
}
