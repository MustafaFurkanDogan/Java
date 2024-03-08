package kodlamaioWithNLAyeredApp.entities;

public class Category {
	 private String name ;
	

	public Category() {
		super();
	}


	public Category(String name)  {
		if (name.equals(this.name)) {
			 throw new IllegalArgumentException("İsimler aynı olamaz.");
		 }else {
			 this.name = name;
		 }
	}


	public String getName() {
		return name;
	}


	public boolean  setName(String name) {
		this.name = name;
		return false;
	}
	

}
