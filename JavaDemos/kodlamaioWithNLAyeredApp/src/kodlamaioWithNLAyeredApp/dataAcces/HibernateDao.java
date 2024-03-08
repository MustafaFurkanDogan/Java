package kodlamaioWithNLAyeredApp.dataAcces;

import kodlamaioWithNLAyeredApp.entities.Category;
import kodlamaioWithNLAyeredApp.entities.Course;
import kodlamaioWithNLAyeredApp.entities.İnstructor;

public class HibernateDao implements KodlamioDao{

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

	@Override
	public void add(İnstructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

}
