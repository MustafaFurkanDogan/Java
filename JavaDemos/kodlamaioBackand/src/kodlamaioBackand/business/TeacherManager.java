package kodlamaioBackand.business;

import kodlamaioBackand.core.logging.Logger;
import kodlamaioBackand.dataAcces.KodlamaioDao;

public class TeacherManager {
	private KodlamaioDao kodlamaioDao;
	private Logger [] loggers;
	
	public TeacherManager(KodlamaioDao kodlamaioDao, Logger[] loggers) {
		super();
		this.kodlamaioDao = kodlamaioDao;
		this.loggers = loggers;
	}

	public void add() {
		
	}

}
