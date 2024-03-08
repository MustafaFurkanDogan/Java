package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
	} 
	
	public static void sayıBulmaca() {
		int[]sayılar = new int[] {1,2,3,4,5,6,7};
		int aranacak = 5;
		boolean varMı = false;
		
		for(int sayı : sayılar) {
			if (sayı==aranacak) {
			varMı = true;
			break;
			}
		}
		
		if(varMı) {
			mesajVer("Sayı mevcuttur :"+aranacak) ;
			
		}else {
			mesajVer("Sayı mevcut değildir :"+aranacak);
		}	
		
	
	
	
	
	
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj); 	
	}

}
