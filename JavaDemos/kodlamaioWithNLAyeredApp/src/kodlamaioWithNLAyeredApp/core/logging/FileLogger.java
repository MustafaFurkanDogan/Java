package kodlamaioWithNLAyeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı: " + data);	
	}

	@Override
	public void log(int length) {
		// TODO Auto-generated method stub
		
	}

}
