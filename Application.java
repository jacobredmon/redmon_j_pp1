import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Application 
{
	
	public static void main(String[] args) 
	{
		long lines = 0;
		
		PatternMatching patternMatch = new PatternMatching();
		
		try
		{
			Scanner scanner = new Scanner(new File(args[0]));
			while(scanner.hasNextLine())
			{
				patternMatch.PatternMatch(scanner.nextLine());
				lines++;
			}
			scanner.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(args[1] == "1")
		{
			patternMatch.getIPAddressesMap().forEach((k,v)->System.out.println(k + " " + v));
		}
		if(args[1] == "2")
		{
			patternMatch.getUsernamesMap().forEach((k,v)->System.out.println(k + " " + v));
		}
		
		System.out.println("The file " + args[0] + " contains " + lines + " lines.");
		System.out.println("There are " + patternMatch.getIPAddressesMapSize() + "unique IP addresses.");
		System.out.println("There are " + patternMatch.getUsernamesMapSize() + "unique usernames.");

	}// end main

}// end Application
