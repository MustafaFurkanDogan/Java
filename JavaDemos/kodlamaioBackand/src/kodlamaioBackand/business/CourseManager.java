package kodlamaioBackand.business;

import kodlamaioBackand.core.logging.Logger;
import kodlamaioBackand.dataAcces.KodlamaioDao;
import kodlamaioBackand.entities.Category;
import kodlamaioBackand.entities.Course;

public class CourseManager {
	private KodlamaioDao kodlamaioDao;
	private Logger[] loggers;
	
	
	public CourseManager(KodlamaioDao kodlamaioDao, Logger[] loggers) {
	
		this.kodlamaioDao = kodlamaioDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		if(course.getUnitPrice()<0){
			throw new Exception("Kurs fiyatının 0'dan büyük olması gerekmektedir");}
		kodlamaioDao.add(course );
		for (Logger logger : loggers) {
			logger.log(course.getUnitPrice());
			
		}
	
	}
	
}
		
		
	


