package hm181107;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "myfile/copy.jpg";
		String target = "myfile/copy3.jpg";

		FileInputStream fn = null;
		FileOutputStream fo = null;
		BufferedInputStream br;
		BufferedOutputStream bw;

		try {
			fn = new FileInputStream(src);
			fo = new FileOutputStream(target);

			br = new BufferedInputStream(fn);
			bw = new BufferedOutputStream(fo);
			
			byte buff[] = new byte[1024];
			
			int size = 0;
			
			while((size=br.read(buff)) != -1)
			{
				System.out.println(size);
				bw.write(buff,0,size);
				bw.flush();
			}
		}

		catch (Exception e) {

		}

	}
}
