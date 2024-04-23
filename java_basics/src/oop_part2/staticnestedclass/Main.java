package oop_part2.staticnestedclass;

import oop_part2.staticnestedclass.Facebook.VideoUploader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb = new Facebook(100,4);
		Facebook.facebookShortVideoDuration = 23;
		Facebook.facebookUser = 2000000000;
		Facebook.uploadSizeLimit = 100;
		
//		System.out.println(fb);
		
		VideoUploader uploader = new VideoUploader(50, 15);
//		uploader.upload();
		
		Tictok.tictokShortVideoDuration = 60;
		Tictok.tictokUser = 1500000000;
		Tictok.uploadSizeLimit = 1;
		
		oop_part2.staticnestedclass.Tictok.VideoUploader uploader2= 
				new oop_part2.staticnestedclass.Tictok.VideoUploader();
		
		uploader2.upload();

	}

}
