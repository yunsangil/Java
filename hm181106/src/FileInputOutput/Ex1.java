package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		// Ű����� �����͸� �Է¹޾Ƽ� ���Ͽ� ����

		String targetFile = "myfile/test2.txt";

		FileOutputStream fo = null;
		FileInputStream fi = null;
		byte[] buff = new byte[1024];
		Scanner in = new Scanner(System.in);
		/*
		 * Enter �� ǥ������ �ü���� ���� �ٸ���. MS-DOS(Windows)������ \r\n�̸� Mac(Mackintosh)������ \r�̰�
		 * Unix�迭������ \n�̴�.
		 */
		try {
			fo = new FileOutputStream(targetFile);
			while (true) {
				System.out.println("Ű����� �Է�>> x�� ����");
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
