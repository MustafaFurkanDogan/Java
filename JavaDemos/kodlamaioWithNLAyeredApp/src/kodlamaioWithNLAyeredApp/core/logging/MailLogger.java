package kodlamaioWithNLAyeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Maile gönderildi: " + data);
	}

	@Override
	public void log(int length) {
		// TODO Auto-generated method stub
		
	}

}
