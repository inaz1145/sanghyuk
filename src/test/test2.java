package test;

import car.*;

public class test2 {
  public static void main(String[] args) { // TODO Auto-generated method stub
  
		/*
		 * int[][] arr= new int[2][3]; int k = 10;
		 * 
		 * for(int i = 0;i<arr.length;i++) { for(int j= 0;j<arr[i].length;j++) {
		 * arr[i][j]=k; k+=10; } }
		 * 
		 * for(int i=0; i<arr.length; i++) { for(int j=0;j<arr[i].length;j++) {
		 * System.out.print(arr[i][j] + " "); } System.out.println(""); }
		 */
	  Car car = new Car("¸ð´×",2020,"ÆÄ¶û");
	  Lamborgini lm = new Lamborgini();
	  
	  Car lcar = (Car)new Lamborgini();
	  //Lamborgini lmCar = (Lamborgini)new Car();
	  
	  car.printCarinfo();
	  lm.printCarinfo();
	  //lcar.printCarinfo();
	  //System.out.println(lm.getName());
	  
	  Integer a = 30;
	  String strA = a.toString();
	  
  
 }
}