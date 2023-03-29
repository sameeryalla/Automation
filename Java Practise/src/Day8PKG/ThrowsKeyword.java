package Day8PKG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		FileWriter fw=new FileWriter("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\Java Practise\\Files\\SampleTest.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        String writenData="Company: SCBGBS";
        bw.write("\r\n");
        bw.write(writenData);
        bw.flush();
        
        FileReader file=new FileReader("C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\Java Practise\\Files\\SampleTest.txt");
        BufferedReader br=new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        } 
        
        Thread.sleep(5000);
        
        
        bw.close();
        br.close();
        
         
	}

}
