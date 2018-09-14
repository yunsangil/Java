package hm20180914;
import java.util.Scanner;
//회원 등록
//회원 수정
///회원 삭제
//
public class Test2 {
	public static void main(String[] args) {
		String[] name = new String[5];
		
		for(int i=0;i<name.length;i++) {
			name[i]="kim"+i;
		}
		for(int i=0;i<name.length;i++) {             //int 나 char 는 ==로 표현할 수 있으나, string(문자열)은 equals로 같은지를 비교한다.
			if(name[i].equals("kim2")) {
				name[i]=null;
			}
			System.out.println(name[i]);
		}
	}

}
