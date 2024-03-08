package kodlamaioWithNLAyeredApp.entities;

public class Course {
	private String name ;
	private int courseDuration;
	private double price;
	public Course() {
		super();
	}
	public Course(String name, int courseduration, int price)  {
		if (price < 0) {
            throw new IllegalArgumentException("Fİyat 0' dan küçük olamaz");}
		this.name = name;
		this.courseDuration = courseduration;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name)  {
	 if (name.equals(this.name)) {
		 throw new IllegalArgumentException("İsimler aynı olamaz.");
	 }else {
		 this.name = name;
	 }
		
	}
	public int getCourseduration() {
		return courseDuration;
	}
	public void setCourseduration(int courseduration) {
		this.courseDuration = courseduration;
	}
	public double getprice() {
		return price;
	}
	public void setprice(Double price)  {
		if (price < 0) {
            throw new IllegalArgumentException("Fİyat 0' dan küçük olamaz");
        }
		this.price = price;
	}
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
