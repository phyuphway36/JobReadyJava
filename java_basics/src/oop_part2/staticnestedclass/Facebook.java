package oop_part2.staticnestedclass;

public class Facebook {
	
	static int facebookUser;//facebook obj a kone lone nae thet sine
	static int uploadSizeLimit;
	static int facebookShortVideoDuration;
	private int localCache;
	private int accountNumber;
	
	static void description() {
		System.out.println("Facebook can be uploaded short,live,long videos");
	
	}
	static class VideoUploader{
		
		private int videoFileSize;
		private int videoDuration;
		
		public VideoUploader(int videoFileSize, int  videoDuration) {
			super();
			this.videoFileSize = videoFileSize;
			this.videoDuration = videoDuration;
		}
		void upload() {//static member tay koo call loz ya
			if(this.videoFileSize <= uploadSizeLimit)
				System.out.println("Video is Uploaded");
			else
				System.out.println("Your Filesize is big");
			if(this.videoDuration <= facebookShortVideoDuration)
				System.out.println("Short video");
			else
				System.out.println("Long or live video");
			
			description();
			System.out.println("facebookUser");
			
			Facebook currentFB = new Facebook();
			
			System.out.println(currentFB.accountNumber);
			System.out.println(currentFB.localCache);
			
			
		}
		
		
	}

	public Facebook() {
		// TODO Auto-generated constructor stub
	}
	public Facebook(int localCache, int accountNumber) {
		super();
		this.localCache = localCache;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Facebook [localCache=" + localCache + ", accountNumber=" + accountNumber + "]";
	}
	
	

}
