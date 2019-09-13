/**
 * This class reads through the file given by args[0] and uses the PatternMatching
 * class to store IP addresses and usernames from a large log file into hashmaps.
 * Prints off default information if args[1] (the print flag) is 0, the IPs if 1, and the usernames if 2.
 * @author Jacob Redmon
 * @version 1.0
 * Programming Project One
 * CS322 - Compiler Construction
 * Spring 2019
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Application 
{
	public static void main(String[] args) 
	{
		int lines = 0;

		PatternMatching patternMatch = new PatternMatching();

		try //tries to read the file
		{
			Scanner scanner = new Scanner(new File(args[0]));
			while(scanner.hasNextLine())
			{
				patternMatch.PatternMatch(scanner.nextLine());
				lines++;
			}// end whiile
			scanner.close();
		}// end try
		catch(IOException e)
		{
			e.printStackTrace();
		}//end try catcg

		if(args[1].equals("1"))// prints out IP addresses and frequency
		{
			patternMatch.getIPAddressesMap().forEach((k,v)->System.out.println("IP Address: " + k + "; Frequency: " + v));
			System.out.println();
		}// end if
		if(args[1].equals("2"))// prints out usernames and frequency
		{
			patternMatch.getUsernamesMap().forEach((k,v)->System.out.println("Username: " + k + "; Frequency:  " + v));
			System.out.println();
		}// end if

		System.out.println("The file " + args[0] + " contains " + lines + " lines.");
		System.out.println("There are " + patternMatch.getIPAddressesMapSize() + " unique IP addresses.");
		System.out.println("There are " + patternMatch.getUsernamesMapSize() + " unique usernames.");

	}// end main

}// end Application
