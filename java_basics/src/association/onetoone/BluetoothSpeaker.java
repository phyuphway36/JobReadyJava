package association.onetoone;

public class BluetoothSpeaker {
	
	private String brand;
	private int db;

	

	public BluetoothSpeaker(String brand, int db) {
		super();
		this.brand = brand;
		this.db = db;
	}
	public void amplifiedSound() {
		// TODO Auto-generated method stub
		System.out.println(brand +"amplified sound upto"+db);
	}

	@Override
	public String toString() {
		return "BluetoothSpeaker [brand=" + brand + ", db=" + db + "]";
	}

	
}
