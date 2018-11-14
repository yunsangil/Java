package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		// 키보드로 데이터를 입력받아서 파일에 저장

		String targetFile = "myfile/test2.txt";

		FileOutputStream fo = null;
		FileInputStream fi = null;
		byte[] buff = new byte[1024];
		Scanner in = new Scanner(System.in);
		/*
		 * Enter 의 표현값은 운영체제에 따라서 다르다. MS-DOS(Windows)에서는 \r\n이며 Mac(Mackintosh)에서는 \r이고
		 * Unix계열에서는 \n이다.
		 */
		try {
			fo = new FileOutputStream(targetFile);
			while (true) {
				System.out.println("키보드로 입력>> x는 종료");
				String memo = in.nextLine();
				if (memo.equals("x"))
					break;
				memo += "\r\n";
				fo.write(memo.getBytes());
				fo.flush();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fi = new FileInputStream(targetFile);
			byte[] m = new byte[1024];
			int memo;
//			while ((memo = fi.read()) != -1) {
//				System.out.print((char) memo);
//			}
			while ((memo = fi.read(m)) != -1) {
				String newS = new String(m);
				newS = newS.trim();
				System.out.println(memo);
				System.out.print(newS);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
