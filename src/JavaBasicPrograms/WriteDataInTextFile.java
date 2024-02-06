package JavaBasicPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataInTextFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\prati\\eclipse-workspace\\CoreJava\\data.txt");
		fo.write(66);
		
		FileInputStream fi = new FileInputStream("C:\\Users\\prati\\eclipse-workspace\\CoreJava\\data.txt");
		
	}

}
