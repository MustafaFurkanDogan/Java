package kodlamaioBackand;

import kodlamaioBackand.business.CourseManager;
import kodlamaioBackand.core.logging.DataBaseLogger;
import kodlamaioBackand.core.logging.FileLogger;
import kodlamaioBackand.core.logging.Logger;
import kodlamaioBackand.core.logging.MailLogger;
import kodlamaioBackand.dataAcces.JdbcDao;
import kodlamaioBackand.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Logger [] loggers = {new DataBaseLogger(),new MailLogger(),new FileLogger()};
	
	
	Course course1 = new Course("Java","45",1000);
	Course course2 = new Course("Java","45",-1);
	Course [] courses = {course1};
	CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
	courseManager.add(course1);
	
	

	


	
		
		


	}

}
