package assgmt1;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assQ3 {

	
  public static void main(String[] args) throws IOException  {

    String file2 = "wahidah.bin";
    Path file3 = Paths.get("last.txt");
    String allwords = "";
    byte[] buffer = new byte[100];

    FileInputStream inputStream = new FileInputStream(file2);
    int total = 0;
    int nRead = 0;

    while((nRead = inputStream.read(buffer)) != -1) 
    {
        String thisBuffer = new String(buffer);
        allwords = allwords + thisBuffer;
        total += nRead;
    }
    inputStream.close();
    System.out.println("Read " + total + " bytes");
    System.out.println("Words read: " + allwords);

    byte data[] = allwords.getBytes();
    OutputStream out = new BufferedOutputStream(Files.newOutputStream(file3, CREATE));
    out.write(data, 0, data.length);
    // close files
    out.close();
  }

}