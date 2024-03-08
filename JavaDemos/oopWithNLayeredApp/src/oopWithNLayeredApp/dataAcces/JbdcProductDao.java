 package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class JbdcProductDao implements ProductDao{
	public void add (Product prduct)  {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
