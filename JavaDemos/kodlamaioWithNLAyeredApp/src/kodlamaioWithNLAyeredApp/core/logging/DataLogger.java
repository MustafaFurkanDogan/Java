package kodlamaioWithNLAyeredApp.core.logging;

public class DataLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı: " + data);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(int length) {
		// TODO Auto-generated method stub
		
	}

}
