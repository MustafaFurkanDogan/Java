package arraysDemo;

public class Main {


	public static void main(String[] args) {
			String ogrencı1=("Ahmet");
			String ogrencı2=("Apo");
			String ogrencı3=("Ali");
			String ogrencı4=("Arya");
			
			System.out.println(ogrencı1);
			System.out.println(ogrencı2);
			System.out.println(ogrencı3);
			System.out.println(ogrencı4);
			
			System.out.println("------");
			
			String[] ogrencıler = new String[4];
			ogrencıler[0]="Ahmet";
			ogrencıler[1]="Apo";
			ogrencıler[2]="Ali";
			ogrencıler[3]="Arya";
			
			for(String ogrencı:ogrencıler){
				System.out.println(ogrencı);
			}
			
				
	}
	}
	
	
	
	
	
	



