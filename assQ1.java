package assgmt1;
import java.io.*;

public class assQ1 {
	 public static void main(String [] args) {

	        String fileName = "wahidah.txt";

	        try {
	                FileWriter fileWriter = new FileWriter(fileName);

	                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		            bufferedWriter.write("Nur Wahidah Mohamed");
		            bufferedWriter.newLine();
		            bufferedWriter.write("Jalan 1/76 Off Jalan Kg Pandan");
		            bufferedWriter.newLine();
		            bufferedWriter.write("Kuala Lumpur");
		            bufferedWriter.close();
	        	}
	        
	        catch(IOException ex) 
	        {
	            System.out.println("Error writing to file '"+ fileName + "'");
	            
	        }
	    }
}
