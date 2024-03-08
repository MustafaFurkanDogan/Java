package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add (Product prduct) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
