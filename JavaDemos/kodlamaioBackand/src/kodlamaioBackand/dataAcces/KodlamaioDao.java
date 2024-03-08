package kodlamaioBackand.dataAcces;

import kodlamaioBackand.entities.Category;
import kodlamaioBackand.entities.Course;
import kodlamaioBackand.entities.Teacher;
public interface KodlamaioDao {
	
	void add(Course course);
	void add(Category category);
	void add(Teacher teacher);

	
}
