package car;
public class Car {
	private String name;
	private int old;
	private String color;
	
	public Car(){
		this.name = "¾Æ¹Ý¶¼";
		this.old = 2018;
		this.color = "Èò»ö";
	}
	
	
	  public Car(String name,int old,String color) { 
		  this.name = name; 
		  this.old =old; 
		  this.color = color;
	}
	 
	
	public void printCarinfo(){
		System.out.println(name);
		System.out.println(old);
		System.out.println(color);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}








