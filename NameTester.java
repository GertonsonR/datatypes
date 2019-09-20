package advancedCS;

import java.util.Scanner;

public class NameTester {

	public static void main(String[] args) {
		String name = "";
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, what's your name?");
		name = keyboard.next();
		System.out.println("Hi " +name+". How old are you?");
		
		
		
		age = keyboard.nextInt();
		System.out.println(name+", you will be 100 in " +(100-age)+ " years.");
		

	}

}