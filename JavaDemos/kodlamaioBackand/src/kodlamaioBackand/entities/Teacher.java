package kodlamaioBackand.entities;

public class Teacher {
 private String firstName;
 private String lastName; 
private String personelData;

public Teacher() {
	super();
}

public Teacher(String name, String personelData) {
	super();
	this.firstName = name;
	this.personelData = personelData;
}

public String getName() {
	return firstName;
}

public void setName(String name) {
	this.firstName = name;
}
public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPersonelData() {
	return personelData;
}

public void setPersonelData(String personelData) {
	this.personelData = personelData;
}


}
