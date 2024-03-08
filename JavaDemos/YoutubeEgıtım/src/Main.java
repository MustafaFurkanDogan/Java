
public class Main {

	public static void main(String[] args) {
		CreditManager creditmanager = new CreditManager();
		creditmanager.Calculate();
		creditmanager.Save();
		
		Customer customer= new Customer();
		customer.Id=1;
		customer.City="Konya";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.TaxNumber="20000";
		company.CompanyName="Bosh";
		company.Id=200;
		
		CustomerManager	customerManager2= new CustomerManager(new Person());
		
		Person person = new Person();
		person.NationalIdentity="";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
		
		System.out.println();
				
	}

}
