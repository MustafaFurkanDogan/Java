package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [][] sehirler = new String [3][3];
	
	sehirler[0][0]="İstabul";
	sehirler[0][1]="Bayburt";
	sehirler[0][2]="Bursa";
	sehirler[1][0]="Konya";
	sehirler[1][1]="Karaman";
	sehirler[1][2]="Ankara";
	sehirler[2][0]="Aydın";
	sehirler[2][1]="Denizli";
	sehirler[2][2]="Eskişehir";
	
	for (int i=0 ;i <=2; i++) {
		System.out.println(               );
		for (int j = 0 ; j<=2; j++) {
			System.out.println(sehirler [i][j]);
		}	
	}
	}

}
