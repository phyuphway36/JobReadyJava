package association.onetoone;

public class MotherBoard {

	private final String brand;
	private final String code;

	
	public MotherBoard(final String brand,final String code) {
		super();
		this.brand = brand;
		this.code = code;
	}

	public void powerOn() {
		System.out.println("MotherBoard is poweringOn");
	}

	public void circuitElectricfied() {
		// TODO Auto-generated method stub
		System.out.println("MotherBoard Electricfied Circuit");
		
	}
	public void circuitDelectricfied() {
		// TODO Auto-generated method stub
		System.out.println("MotherBoard delectricfied Circuit");
		
	}

	public void initializedDrive() {
		// TODO Auto-generated method stub
		System.out.println("MotherBoard initializing Drive C");
		
	}

	public void initializeMemory() {
		// TODO Auto-generated method stub
		System.out.println("MotherBoard initializing RAM");
		

		
	}

	public void cpuProcessing() {
		// TODO Auto-generated method stub		
		System.out.println("MotherBoard Processing CPU");
		

		
	}

	public void gpuProcessing() {
		// TODO Auto-generated method stub
		System.out.println("MotherBoard Processing GPU");

		
	}

	@Override
	public String toString() {
		return "MotherBoard [brand=" + brand + ", code=" + code + "]";
	}

	public void connectSpeaker() {
		// TODO Auto-generated method stub
		System.out.println("Motherboard supply power to speaker");
		System.out.println("Motherboard write audio Stream on memory");
		
	}
	
}
