package testEingabeAusgabe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) {
		
		String content = "This is the content to write into file\n";
		try 
			(FileWriter writer = new FileWriter("app.log");
			BufferedWriter bw = new BufferedWriter(writer)) {
			
			bw.write(content);
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
