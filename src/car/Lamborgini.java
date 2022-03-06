package car;

public class Lamborgini extends Car{
	
	public Lamborgini(){
		super("람보르기니",2021,"레드");
	}
	
	public void printCarinfo(){
		System.out.println("나는 자식이다.");
		super.printCarinfo();
	}
	 
}
