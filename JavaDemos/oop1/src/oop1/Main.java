package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(5);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(5);
		product2.setUnitPrice(700);
		product2.setUnitsInStock(8);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(6000);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setFirstName("Berra");
		individualCustomer.setLastName("Doğan");
		individualCustomer.setId(1);
		individualCustomer.setPhone("055533333222");
		individualCustomer.setCustomerNumber("11111");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Apple");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("555553225558525");
		corporateCustomer.setCustomerNumber("222222");
		corporateCustomer.setTaxNumber("543682");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
