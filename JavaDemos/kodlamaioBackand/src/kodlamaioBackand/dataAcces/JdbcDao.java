package kodlamaioBackand.dataAcces;

import kodlamaioBackand.entities.Category;
import kodlamaioBackand.entities.Course;
import kodlamaioBackand.entities.Teacher;
public class JdbcDao  implements KodlamaioDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veri tabanına eklendi.");	
	
		
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veri tabanına eklendi.");
	}

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veri tabanına eklendi.");
	}

}
