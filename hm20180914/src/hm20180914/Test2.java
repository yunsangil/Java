package hm20180914;
import java.util.Scanner;
//ȸ�� ���
//ȸ�� ����
///ȸ�� ����
//
public class Test2 {
	public static void main(String[] args) {
		String[] name = new String[5];
		
		for(int i=0;i<name.length;i++) {
			name[i]="kim"+i;
		}
		for(int i=0;i<name.length;i++) {             //int �� char �� ==�� ǥ���� �� ������, string(���ڿ�)�� equals�� �������� ���Ѵ�.
			if(name[i].equals("kim2")) {
				name[i]=null;
			}
			System.out.println(name[i]);
		}
	}

}
