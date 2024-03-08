package overriding;

public class Main {

	public static void main(String[] args) {
	BasecreditManager [] creditsManagers = new BasecreditManager [] {new TeacherCreditManager(),new FarmerCreditManager(), new StudentCreditManager()};
	for (BasecreditManager creditManager : creditsManagers) {
		System.out.println(creditManager.hesapla(1000));
		
	}
	}

}


// final = Başka biri tarfaınfan basecreditmanagerimiz değiştirilmesin istersek bunu ekliyoruz.