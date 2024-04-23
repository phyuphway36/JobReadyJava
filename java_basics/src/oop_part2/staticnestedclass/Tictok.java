package oop_part2.staticnestedclass;

public class Tictok {
	
	static int tictokUser;//facebook obj a kone lone nae thet sine
	static int uploadSizeLimit;
	static int tictokShortVideoDuration;
	private int localCache;
	private int accountNumber;
	
	static void description() {
		System.out.println("Tictok can be uploaded short videos");
	
	}
	static class VideoUploader{
		

		void upload() {//static member tay koo call loz ya
			
			
			description();
			System.out.println("tictokUser");
			
			Tictok tt = new Tictok();
			
			System.out.println(tt.accountNumber);
			System.out.println(tt.localCache);
			
			
		}
		
		
	}


}
