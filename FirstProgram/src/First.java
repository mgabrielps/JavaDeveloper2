import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		//Instantiate Scanner and tell it
		//to look for input from System.in (console)
		Scanner input = new Scanner(System.in);
		String name;
		//Give the user a prompt
		System.out.println("What's your name");
		//Store the user's response
		name = input.nextLine();
		System.out.println("Your name is " + name);
		

		int age;
		//Ask the user for their age
		System.out.println("Hi " + name + " how old are you?");
		//Store user's age as variable
		age = input.nextInt();
		//Print out user's age
		System.out.println("So you're " + age + " years old.");
	}
}
