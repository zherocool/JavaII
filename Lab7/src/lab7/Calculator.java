package lab7;

import java.util.List;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println(Constants.WELCOME_MESSAGE);
		
		startInputLoop();
	}
	
	public static void startInputLoop() {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.next().split(Constants.DELIMETER);
		boolean stop = true; //input. .contains(Constants.QUIT_SEQUENCE);
		
		
		while (!stop) {
			
		}
	}
}
