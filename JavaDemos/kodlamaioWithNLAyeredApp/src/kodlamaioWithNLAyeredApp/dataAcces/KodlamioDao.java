package kodlamaioWithNLAyeredApp.dataAcces;

import kodlamaioWithNLAyeredApp.entities.Category;
import kodlamaioWithNLAyeredApp.entities.Course;
import kodlamaioWithNLAyeredApp.entities.İnstructor;

public interface KodlamioDao {
	
	 void add (Course course);
	 void add (İnstructor instructor);
	void add(Category category);

}
