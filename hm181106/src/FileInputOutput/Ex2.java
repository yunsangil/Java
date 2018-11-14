package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		String targetfile = "myfile/copy.jpg";

		FileInputStream fi = null;
		FileOutputStream fo = null;

		byte[] buff = new byte[1024];
		try {
			fi = new FileInputStream(targetfile);
			fo = new FileOutputStream("myfile/copy2.jpg");
			int count=0;
			int countbyte=0;
			while ((countbyte=fi.read(buff)) != -1) {
				fo.write(buff);
				
			}
			fi.close();
			fo.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
