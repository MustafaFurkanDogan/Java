package kodlamaioWithNLAyeredApp.business;

import kodlamaioWithNLAyeredApp.core.logging.Logger;
import kodlamaioWithNLAyeredApp.dataAcces.KodlamioDao;
import kodlamaioWithNLAyeredApp.entities.Course;

public class CourseManager {
	public void add(Course course) {}
	private KodlamioDao kodlamioDao;
	private Logger[] loggers;
	
	public CourseManager(KodlamioDao kodlamioDao,Logger[] loggers, Course course, Course course2) {
		this.kodlamioDao = kodlamioDao;
		this.loggers = loggers;
	
		
		kodlamioDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
			logger.log(course2.getName());
			
		}
	}
		
	


	
	
		
	

	
}


