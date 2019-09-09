/**
 * This class uses regular expressions to read a large .log file
 * @author Jacob Redmon
 * @version 1.0
 * Programming Project OOne
 * CS322 - Compiler Construction
 * Spring 2019
 */

public class Application {

	/*
	 * accepts two arguments: (filename, printflag)
	 * filename: name of the file to process
	 * printflag: 0 - print default output
	 *	      1 - print hashmap of IP addresses and default
	 *	      2 - print hashmap usernames and default
 	 */
	public static void main(String[] args) {

		System.out.println("The file being processed is: " + args[0]);
		System.out.println("The printflag is: " + args[1]);

	}//end main

}//end Application
