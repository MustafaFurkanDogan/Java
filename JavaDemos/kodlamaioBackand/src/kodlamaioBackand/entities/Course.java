package kodlamaioBackand.entities;

public class Course {
	private String name;
	private String courseTime;
	private int unitPrice;
	public Course() {
		
	}
	public Course(String name, String courseTime, int unitPrice) {
	
		this.name = name;
		this.courseTime = courseTime;
		this.unitPrice = unitPrice;
		
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return name;
	}
	
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
		
	}
	
	

}
