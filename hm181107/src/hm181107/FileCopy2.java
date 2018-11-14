package hm181107;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopy2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("������ ���� �̸��� �Է��ϼ���.");
		String src = in.nextLine();
		src = "myfile/" + src + ".jpg";
		File f = new File(src);
		if (f.exists() == true) {
			System.out.println("���� �� ���� �̸��� �Է��ϼ���.");
			String target = in.nextLine();
			target = "myfile/" + target + ".jpg";
			
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
				float filelength = f.length();
				float totalsize = 0;

				while ((size = br.read(buff)) != -1) {
					bw.write(buff, 0, size);
					bw.flush();
					totalsize +=size;
					float percent = totalsize/filelength*100;
					System.out.println(percent+"%");
					Thread.sleep(300);
				}
			}

			catch (Exception e) {
				System.out.println("���� �߻�!");
			}
		}
		else {
			System.out.println("������ �������� �ʽ��ϴ�!");
			main(args);
		}
	}

}
