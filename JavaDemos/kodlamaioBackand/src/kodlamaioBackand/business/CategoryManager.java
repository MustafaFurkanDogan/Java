package kodlamaioBackand.business;

import kodlamaioBackand.core.logging.Logger;
import kodlamaioBackand.dataAcces.KodlamaioDao;
import kodlamaioBackand.entities.Category;

public class CategoryManager {
	private KodlamaioDao kodlamaioDao;
	private Logger[] loggers;

	public CategoryManager(KodlamaioDao kodlamaioDao, Logger[] loggers) {
		super();
		this.kodlamaioDao = kodlamaioDao;
		this.loggers = loggers;
	}

	public void add(Category category)throws Exception {
		if(category.getName().equals(category.getName()) ) {
		}
		kodlamaioDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

		
	}

}
