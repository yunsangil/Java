package ArrayEx;

public class Array0913_1 {
	public static void main(String[] args) {

		int[] num = new int[] { 12, 32, 52, 4, 8, 25 };
		int count = 0;
		int space = 0;
		for(count=0;count<6;count++)
		{
		for (int i =count+1; i < 6; i++) {
			if (num[count] > num[i]) {
				space = num[count];
				num[count] = num[i];
				num[i] = space;
			}
		}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "/");
		}
	}
}
