package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabasLogger;
import oopWithNLayeredApp.core.logging.Filelogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JbdcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"IphoneProMax15",7000);
		
		Logger[]loggers = {new DatabasLogger(), new Filelogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
