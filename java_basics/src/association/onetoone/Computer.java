package association.onetoone;

public class Computer {

	private String brand;
	private String model;
	//one to one composition
	private final MotherBoard motherBoard;
	//one to one Aggregation
	private BluetoothSpeaker bluSpeaker;
	private Boolean powerOn = false;
	
	
	
	public Computer(String brand, String model,final MotherBoard motherBoard) {
		super();
		this.brand = brand;
		this.model = model;
		this.motherBoard = motherBoard;
	}
	public void speaker() {
		if(powerOn) {
			motherBoard.connectSpeaker();
			if(bluSpeaker != null) {
				bluSpeaker.amplifiedSound();
				
				System.out.println("Produced Loud Sound With Bluetooth speaker");
			}
			else 
				System.out.println("Produced Normal Sound With Default Speaker");
		}
		else
			System.out.println("Dude Really."
					+"What you expect without poweron");
		
	}

	public void powerOn() {
		if(motherBoard != null) {
			motherBoard.circuitElectricfied();
			System.out.println("Computer is powering on");
			this.powerOn = true;
		}
		else 
			System.out.println("Wtf, where is motherboard?");
	}
	
	public void runProgram() {
		if(powerOn) {
			motherBoard.initializedDrive();
			motherBoard.initializeMemory();
			motherBoard.cpuProcessing();
			motherBoard.gpuProcessing();
			System.out.println("Computer is running program");
		}
		else
			System.out.println("Dude Really."
					+"What you expect without poweron");
		
	}
	public void powerOff() {
		if(motherBoard != null) {
			motherBoard.circuitDelectricfied();
			System.out.println("Computer is delectiricfied{");
			this.powerOn = false;
		}
		else 
			System.out.println("Wtf, where is motherboard?");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

		@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", motherBoard=" + motherBoard + ", bluSpeaker="
				+ bluSpeaker + ", powerOn=" + powerOn + "]";
	}
		public BluetoothSpeaker getBluSpeaker() {
		return bluSpeaker;
	}
	public void setBluSpeaker(BluetoothSpeaker bluSpeaker) {
		this.bluSpeaker = bluSpeaker;
	}
	
	
}
