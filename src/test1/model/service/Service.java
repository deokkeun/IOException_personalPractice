package test1.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {
	
	public void inputStream() {
		FileInputStream fis= null;
		
		try {
			fis = new FileInputStream("text1.txt");

			
			while(true) {
				int data = fis.read();
				
				if(data == -1) {break;}
				
				System.out.print((char)data);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void outputStream() {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("text1.txt");
			
			String str = "Hello";
			
			for(int i = 0; i < str.length(); i++) {
				fos.write(str.charAt(i));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
	
	public void fileWriter() {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
			
			String string = "안녕하세요 IOException 연습입니다!";
			
			fw.write(string);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void fileReader() {
		FileReader fr= null;
		
		try {
			fr = new FileReader("text1.txt");
			
			while(true) {
				
				int data = fr.read();
				
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	

}
