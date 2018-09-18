package Test01;

public class TwoWayArray4B {
	/*
	4. <사선채우기>
	 1  2  4  7 11 16 21 //1  1 2 3 4 5 5 
	 3  5  8 12 17 22 26 //3  2 3 4 5 5 4  
	 6  9 13 18 23 27 30 //6  3 4 5 5 4 3
	 10 14 19 24 28 31 33//10 4 5 5 4 3 2
	 15 20 25 29 32 34 35//15 5 5 4 3 2 1
	 
	 1  2  4  7 11 16 21 
	 3  5  8 12 17 22 26  
	 6  9 13 18 23 27 30
	 10 14 19 24 28 31 33
	 15 20 25 29 32 34 35
	 */
	public static void main(String[] args) {
		int[] firstArray = new int[35];
		int[][] TwoWayArray = new int[5][7];
		int number=1, index=0,count=0,start=1,diff=0,x=0;
		while(number<=35||!(index==35)) {
			firstArray[index]=number;
			System.out.print(firstArray[index]+"/");
			count++;
			number+=count+diff;
			
			if(number>35) {
				System.out.println();
				x++;
				diff++;
				start+=diff+1;
				number=start;
				count=0;
			}
			index++;
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				TwoWayArray[i][j]=firstArray[(i*7)+j];
				System.out.print(TwoWayArray[i][j]+"/");
			}
			System.out.println();
		}
		}
}
	