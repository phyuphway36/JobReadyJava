package smart_phone;

public class Main {	public static void main(String[] args) {
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

}
