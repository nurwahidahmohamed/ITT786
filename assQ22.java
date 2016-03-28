package assgmt1;
import java.io.*;
import java.nio.file.Paths;

public class assQ22 {

	public static void main(String[] args) throws IOException 
	{

        Path file1 = Paths.get("wahidah.txt");
        String file2 = "wahidah.txt";

        byte[] buffer = Files.readAllBytes(file1);

        FileOutputStream outputStream = new FileOutputStream(file2);
        outputStream.write(buffer);
        outputStream.close();       

        System.out.println("Wrote " + buffer.length + " bytes");
     }
        
}
