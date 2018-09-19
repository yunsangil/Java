package Test01;

public class TwoWayArray6 {

	static int x=1,y=0;
	public static void main(String[] args) {
		int[][] TwoWayArray = new int[5][5];
		/*
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 *  6  1  2  3  4  ¤¡
		 * 11 12  7  8  5 ¤©
		 * 16 17 13  9 10  ´Ã¿©³õÀº¤©
		 * 21 18 19 14 15 ¤©
		 * 22 23 24 25 20 ¿ª¤¤
		 */
		int count=0;
		int diff=0;
		int number=1;
		int t1=0, t2=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				TwoWayArray[i][j]=number;
				System.out.print(TwoWayArray[i][j]+"/");
				number++;
			}
			System.out.println();
		}
		System.out.println();
		
		while(count<8)
		{
			diff= count/4;
			switch(count%4)
			{
			case 0:
				for(int i=5-diff-1;i>diff;i--) {
					if(i==5-diff-1) {
						t1=TwoWayArray[diff][i];
						TwoWayArray[diff][i] = TwoWayArray[diff][i-1];

						System.out.println("clear case0");
					}
					else {
						TwoWayArray[diff][i]=TwoWayArray[diff][i-1];

						System.out.println("clear case0-1");
					}
				}
				break;
			case 1:
				for(int i=diff+1;i<5-diff;i++) {
					if(i==diff+1) {
						t2= TwoWayArray[5-i][5-i];
						TwoWayArray[5-i][5-diff-1] = TwoWayArray[5-i-1][5-diff-1];

						System.out.println("clear case1-0");
					}
					else {
						TwoWayArray[5-i][5-diff-1] = TwoWayArray[5-i-1][5-diff-1];

						System.out.println("clear case1-1");
					}
				}
				TwoWayArray[diff+1][5-diff-1]=t1;
				break;
			case 2:
				for(int i=diff;i<5-diff-1;i++) {
					if(i==diff) {
						t1 = TwoWayArray[5-diff-1][diff];
						if(diff-1+i<0)
						{
							;
						}
						else {
						TwoWayArray[5-diff-1][diff-1+i] = TwoWayArray[5-diff-1][diff+i];
						}

						System.out.println("clear case2-0");
					}
					else {
						TwoWayArray[5-diff-1][diff-1+i] = TwoWayArray[5-diff-1][diff+i];
						System.out.println("clear case2-1");
					}
				}
				TwoWayArray[5-diff-1][5-1-diff-1]=t2;
				break;
			case 3:
				for(int i=5-diff-1;i>diff;i--) {
					TwoWayArray[5-1-diff-i][diff] = TwoWayArray[5-diff-i][diff];

					System.out.println("clear case3-0");
				}
				TwoWayArray[5-1-diff-1][diff] = t1;
				break;
				}
			count+=1;
			}
		TwoWayArray[0][1]=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(TwoWayArray[i][j]+"/");
			}
			System.out.println();
		}
	}
}