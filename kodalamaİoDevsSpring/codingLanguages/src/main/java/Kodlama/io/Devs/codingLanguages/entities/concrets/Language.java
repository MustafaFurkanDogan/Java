package Kodlama.io.Devs.codingLanguages.entities.concrets;

public class Language {
	private int ıd;
	private String name;
	public Language() {
		
	}
	public Language(int id, String name) {
	
		ıd = id;
		this.name = name;
	}
	public int getId() {
		return ıd;
	}
	public void setId(int id) {
		ıd = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

}
