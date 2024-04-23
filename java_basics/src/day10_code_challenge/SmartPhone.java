package day10_code_challenge;

public class SmartPhone {
	
	String model;
	String color;
	double price;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SmartPhone
		SmartPhone smartPhone =   new SmartPhone();

		smartPhone.color ="black";
		smartPhone.price=300000;
		smartPhone.model="Huawei";
		System.out.println("Phone color is  "+smartPhone.color);
		System.out.println("Phone price is "+smartPhone.price);
		System.out.println("Phone model is "+smartPhone.model);
		
		smartPhone.canPlayGame();
		smartPhone.powerOff();
		smartPhone.sendMessage();

	}
	static void canPlayGame() {
		System.out.println("Phone can play game.");
	}
	static void sendMessage() {
		System.out.println("Phone can send message.");
	}
	
	static void powerOff() {
		System.out.println("Power Off");
	}
}
	
