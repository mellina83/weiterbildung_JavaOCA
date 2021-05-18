package trywithresources03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01TryWithResources {

	public static void main(String[] args) {
		System.out.println("Programm Start");
		//demoTryWithOutResources();
		demoTryWithResources();
		System.out.println("Programm Ende");
	}

	private static void demoTryWithResources() {
		File file = new File("test.txt");
		
		try(FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr)){

			while(br.ready()) {
				System.out.println(br.readLine());
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} 
		
		
	}

	private static void demoTryWithOutResources() {
		File file = new File("test.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);//<--- FileNotFoundException
			br = new BufferedReader(fr);//null
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Fehler wurde behoben");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Fehler wurde behoben");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Fehler wurde behoben");
			}
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Fehler wurde behoben");
			}
		}
		
		
	}

	
	
}
