package com.iostreams;

import java.io.File;
import java.io.FileOutputStream;

public class Helloworld {
	public static void main(String[] args) {
		String location = "D:\\10kCoders\\Java\\src\\Java10k\\src\\com\\iostreams\\hello.txt";
		File file = new File(location);
		try {
			if(file.exists()) {
				System.out.println("File Exists");
				String text = "Hello My name is lakshman";
				FileOutputStream fs = new FileOutputStream(location);
				byte[] by = text.getBytes();
				fs.write(by);
				System.out.println("File Written Sucessfully");
				fs.close();
			}else {
				System.out.println("File not exists creating file...");
				boolean creation = file.createNewFile();
				if(creation) {
					System.out.println("File created sucessfully");
					main(args);
					}
				else{
					System.out.println("Something went wrong while creating the file");
					};
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
