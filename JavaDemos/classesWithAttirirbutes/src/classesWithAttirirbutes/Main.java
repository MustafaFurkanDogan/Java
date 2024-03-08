package classesWithAttirirbutes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1, "Laptop", "AsusLaptop",5000, 5);
		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(5000);
		//product.setStockAmount(5);
		
		
		ProductManager productManager = new ProductManager();	
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
