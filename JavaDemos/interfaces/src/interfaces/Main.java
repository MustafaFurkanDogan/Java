package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerDal customerDal = new MySqlCustomerDal();
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
