package kodlamaioWithNLAyeredApp;

import kodlamaioWithNLAyeredApp.business.CategoryManager;
import kodlamaioWithNLAyeredApp.business.CourseManager;
import kodlamaioWithNLAyeredApp.business.İnstructorManager;
import kodlamaioWithNLAyeredApp.core.logging.DataLogger;
import kodlamaioWithNLAyeredApp.core.logging.FileLogger;
import kodlamaioWithNLAyeredApp.core.logging.Logger;
import kodlamaioWithNLAyeredApp.core.logging.MailLogger;
import kodlamaioWithNLAyeredApp.dataAcces.HibernateDao;
import kodlamaioWithNLAyeredApp.dataAcces.JdbcDao;
import kodlamaioWithNLAyeredApp.entities.Category;
import kodlamaioWithNLAyeredApp.entities.Course;
import kodlamaioWithNLAyeredApp.entities.İnstructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1 = new Course("Java",45,500);
		Course course2 = new Course("C++", 55, 700);
		Logger [] loggers = {new DataLogger(), new FileLogger(), new MailLogger()};
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, course1, course2);
		courseManager.add(course1);
		courseManager.add(course2);
		
		System.out.println("--------------------------");
		
		Category category = new Category("Proglamlama");
		Category category2 = new Category("Algoitma");
		Logger [] loggers1 = {new DataLogger(), new FileLogger(), new MailLogger()};
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers1, category , category2);
		categoryManager.add(category);
		
		System.out.println("--------------------------");
		
		   İnstructor instructor1 = new İnstructor("Engin", "DEMİROĞ");
	        İnstructor instructor2 = new İnstructor("Halit Enes", "KALAYCI");
	        İnstructorManager instructorManager = new İnstructorManager(new JdbcDao(),loggers, instructor1, instructor2);
	        instructorManager.add(instructor1);
	        instructorManager.add(instructor2);
		
		
		
		
		
	}
	
	
	
	
}
