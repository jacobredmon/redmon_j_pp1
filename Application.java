import java.util.*;
import java.io.*;

public class Application 
{
	
	public static void main(String[] args) 
	{

		//PatternMatching patternMatch = new PatternMatching();
		HashMap<String, Integer> map = new HashMap<>();
	    String filePath = "auth.log";
	    BufferedReader br;
	    String line = "";
	    String p = ".*?([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5]\\d).*\\w+"; //pattern for IP addresses
	    int count = map.containsKey(line) ? map.get(line) : 0;
	    
	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	            	//System.out.println(line);
	            	if(line.matches(p) == true)
	            	{
	            		//System.out.println(line);
	            		map.put(line, count + 1);
	            	}
	            }
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		
		System.out.println(map.size());
	    
	}// end main

}// end Application
