package kodlamaioWithNLAyeredApp.business;

import kodlamaioWithNLAyeredApp.core.logging.Logger;
import kodlamaioWithNLAyeredApp.dataAcces.KodlamioDao;
import kodlamaioWithNLAyeredApp.entities.Course;
import kodlamaioWithNLAyeredApp.entities.İnstructor;

public class İnstructorManager {
	public void add(İnstructor instructor1) {}
	private KodlamioDao kodlamioDao;
	private Logger[] loggers;
	
	public İnstructorManager(KodlamioDao kodlamioDao,Logger[] loggers,İnstructor instructor, İnstructor instructor2) {
		this.kodlamioDao = kodlamioDao;
		this.loggers = loggers;
	
		
		kodlamioDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
			logger.log(instructor2.getFirstName());
			
		}

}
}