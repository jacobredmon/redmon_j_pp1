import java.util.regex.*;
import java.util.HashMap;

public class PatternMatching 
{
	
	private HashMap<String, Integer> IPAddressesMap = new HashMap<>();
	private HashMap<String, Integer> UsernamesMap = new HashMap<>();
	
	/*
	 * Constructor to initialize hashmaps
	 */
	public PatternMatching() 
	{
		IPAddressesMap = new HashMap<>();
		UsernamesMap = new HashMap<>();
	}
	
	/*
	 * Accessor to return IPAddressesMap
	 * @return IPAddressesMap
	 */
	public HashMap<String, Integer> getIPAddressesMap()
	{
		return IPAddressesMap;
	}
	
	/*
	 * Accessor to return UsernamesMap
	 * @return UsernamesMap
	 */
	public HashMap<String, Integer> getUsernamesMap()
	{
		return UsernamesMap;
	}
	
	/*
	 * Returns the number of entries in IPAddressesMap
	 */
	public int getIPAddressesMapSize()
	{
		return IPAddressesMap.size();
	}
	
	/*
	 * Returns the number of entries in UsernamesMap
	 */
	public int getUsernamesMapSize()
	{
		return UsernamesMap.size();
	}
	
	/*
	 * Searches the string of the log file for any IP addresses and UsernamesMap
	 * If any are found, adds to the relevant HashMap and increments the value as a frequency
	 * @param line The String being processed
	 */
	public void PatternMatch(String input) 
	{
	    //regex pattern to match only *valid* ip addresses
	    Matcher ipPattern = Pattern.compile("([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5]\\d)").matcher(input); //pattern for IP addresses
	    //regex pattern to match usernames in the log file
	    Matcher usernamePattern = Pattern.compile("username").matcher(input);
	    
	    /*
	     * searches the input string for a match to the IP address regex called 'ipPattern'
	     * if it's found, adds it to the HashMap and increments the frequency for that IP address by 1, or sets it to 1 if it is a new IP address
	     */
	    while(ipPattern.find())
	    {
	    	String match = ipPattern.group();
	    	if(IPAddressesMap.containsKey(match))
	    	{
	    		IPAddressesMap.put(match, IPAddressesMap.get(match) + 1);
	    	} else 
	    	{
	    		IPAddressesMap.put(match, 1);
	    	}// end if else
	    }// end while
	    
	    /*
	     * searches the input string for a match to the username regex called 'usernamePattern'
	     * if it's found, adds it to the HashMap and increments the frequency for that username by 1, or sets it to 1 if it is a new username
	     */
	    while(usernamePattern.find())
	    {
	    	String match = usernamePattern.group();
	    	if(UsernamesMap.containsKey(match))
	    	{
	    		UsernamesMap.put(match, UsernamesMap.get(match) + 1);
	    	} else 
	    	{
	    		UsernamesMap.put(match, 1);
	    	}// end if else
	    }// end while
	    
	}//end PatternMatch
	
}// end PatternMatching
