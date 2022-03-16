package oop;

public class Phone {
	
	String model="iphone 8";
	
	
	
	//below is my methods
	
	
	void call() {
		System.out.println("calling....unknown");
	}
	
 	public void text() {
 		System.out.println("texting.......unknown");
 	}
	
 	public void call(String num) {
 		
		System.out.println("calling...."+num);
	}
 	public void showmodel() {
 		System.out.println(model);
 	}

}
