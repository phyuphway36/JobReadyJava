package hybrid_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iphone iphone = new Iphone();
		iphone.color ="purple";
		iphone.model = "Iphone";
		iphone.price = 30000000;
		iphone.storage = 128;
		System.out.println(iphone.color);
		System.out.println(iphone.model);
		System.out.println(iphone.price);
		System.out.println(iphone.storage);
		iphone.sendMessage();
		iphone.size();
		iphone.takeSelfie();
		System.out.println();
		
		Iphone13 iphone13 = new Iphone13();
		iphone13.color = "white";
		iphone13.model = "Iphone13";
		iphone13.price = 32000000;
		iphone13.storage = 128;
		System.out.println(iphone13.color);
		System.out.println(iphone13.model);
		System.out.println(iphone13.price);
		System.out.println(iphone13.storage);
		iphone.sendMessage();
		iphone13.sendMessage();
		iphone13.size();
		iphone13.design();
		System.out.println();
		
		
		Huawei huawei = new Huawei();
		huawei.color = "black";
		huawei.model = "Huawei";
		huawei.price = 500000;
		huawei.storage = 64;
		System.out.println(huawei.color);
		System.out.println(huawei.model);
		System.out.println(huawei.price);
		System.out.println(huawei.storage);
		huawei.heavyDuty();
		huawei.sendMessage();
		huawei.takeSelfie();

		}

}
