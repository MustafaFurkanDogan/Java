package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;// starataji belirleme;
	
	
	public void getCustomers() {
		databaseManager.getData();
		
	}

}
