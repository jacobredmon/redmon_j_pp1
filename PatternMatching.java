import java.util.*; 
import java.io.*;

public class PatternMatching 
{
	
	public PatternMatching() 
	{
		
		HashMap<String, Integer> map = new HashMap<>();
		
	    String filePath = "C:/Users/Jrred/eclipse-workspace/auth.log";
	    BufferedReader br;
	    String line = "";

	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	            	
	            }
	            br.close();
	        } catch (IOException e) {
	            //e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        //e.printStackTrace();
	    }
		
	}
	
}// end PatternMatching
