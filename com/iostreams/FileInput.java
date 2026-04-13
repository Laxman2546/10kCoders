package com.iostreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInput {

	public static void main(String[] args) throws IOException {
		String location = "D:\\10kCoders\\Java\\src\\Java10k\\src\\com\\iostreams\\hello.txt";
		String writelocation = "D:\\10kCoders\\Java\\src\\Java10k\\src\\com\\iostreams\\hello2.txt";
		FileInputStream fis = new FileInputStream(location);
		FileOutputStream fos = new FileOutputStream(writelocation);
		File file = new File(writelocation);
		if(!file.exists()) {
			file.createNewFile();
		}
		int  i;
		while((i=fis.read()) != -1) {
			fos.write(i);			
		}
		fis.close();
		fos.close();
	}

}
