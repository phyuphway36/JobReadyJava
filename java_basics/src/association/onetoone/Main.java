package association.onetoone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotherBoard motherBoard = new MotherBoard("Gigabyte","G-4067");

		Computer computer =  new Computer("MSI","Moderan-14",motherBoard);
		System.out.println(computer);
		computer.powerOn();
//		computer.runProgram();
		BluetoothSpeaker bs = new BluetoothSpeaker("Remax speaker", 150);
		computer.setBluSpeaker(bs);
		computer.speaker();
		System.out.println(computer);
//		computer.powerOff();
//		System.out.println(computer.getMotherBoard());

		
	}

}
