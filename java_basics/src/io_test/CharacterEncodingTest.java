package io_test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharacterEncodingTest {

	public static void main(String[] args)  {
		try {
			printEncodingDetails("o");
			printEncodingDetails("&");
			printEncodingDetails("\u1F602");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	static void printEncodingDetails(String character) throws UnsupportedEncodingException {
		System.out.println("Character : "+character+"\r\n");
		System.out.println("US-ASCII : "+Arrays.toString(character.getBytes("US-ASCII")));
		System.out.println("ISO-8859-1 : "+Arrays.toString(character.getBytes("ISO-8859-1")));
		System.out.println("UTF-8 : "+Arrays.toString(character.getBytes("UTF-8")));
		System.out.println("UTF-16 : "+Arrays.toString(character.getBytes("UTF-16")));
		System.out.println("UTF-16BE : "+Arrays.toString(character.getBytes("UTF-16BE")));
		System.out.println("UTF-16LE : "+Arrays.toString(character.getBytes("UTF-16LE")));
		System.out.println();

	}
	}


