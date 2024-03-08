
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

	String ortaMetin="ilginizi cekebilir";
	String altMetin="vade";	
	
	System.out.println(ortaMetin);
	

	
	double dolarDun = 18.20;
	double dolarBugun = 18.20;
	
	boolean dolarDustuMu = false;
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) 
		okYonu = "down.svg";
		System.out.println(okYonu);
		 if (dolarBugun>dolarDun) {
		okYonu = "up.svg";
		System.out.println(okYonu);
		}else {
		 okYonu = "Equal.svg";
	      System.out.println(okYonu);

	      String[] krediler = {"hızlı","yavas","emekli"};
	      
	     
	      for (int i = 0; i < krediler.length; i++) {
	    	  System.out.println(krediler[i]);
		}
	      
	}
	

}
	

}
