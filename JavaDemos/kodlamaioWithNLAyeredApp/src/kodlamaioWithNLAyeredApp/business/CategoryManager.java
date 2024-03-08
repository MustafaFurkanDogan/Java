package kodlamaioWithNLAyeredApp.business;

import kodlamaioWithNLAyeredApp.core.logging.Logger;
import kodlamaioWithNLAyeredApp.dataAcces.KodlamioDao;
import kodlamaioWithNLAyeredApp.entities.Category;

public class CategoryManager {
	public void add(Category category ) {}
	
	private KodlamioDao kodlamioDao;
	private Logger[] loggers;
	
	public CategoryManager(KodlamioDao kodlamioDao,Logger[] loggers, Category categori, Category category2) {
		this.kodlamioDao = kodlamioDao;
		this.loggers = loggers;
	
		
		kodlamioDao.add(categori);
		
		for (Logger logger : loggers) {
			logger.log(categori.getName());
			
		}
	}
	
	
	
	
	
	
	
		
	
}

	


