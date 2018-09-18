package Test01;

public class TwoWayArray4 {
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
		int[][] TwoWayArray = new int[5][7];
		int[][] TwoWayArray2 = new int[][]
				
		{
			{1,1,2,3,4,5,5},
			{3,2,3,4,5,5,4},
			{6,3,4,5,5,4,3},
			{10,4,5,5,4,3,2},
			{15,5,5,4,3,2,1}
		};
		for(int i=0;i<TwoWayArray.length;i++)
		{
			int count=0;
			for(int j=0;j<TwoWayArray[0].length;j++)
			{
				count+=TwoWayArray2[i][j];
				TwoWayArray[i][j]=count;
				System.out.print(TwoWayArray[i][j]+"/");
			}
			System.out.println();
		}
	}
}
//배열의 사이즈는 5x7
/*1. 1 6
*   2 7
*   3 8
*   4 9
*   5 10 행 중심으로
   
   
2. 1 2 3 4 5 6 7
 14 13 12 11 10 9 8
 15 16 17 18 19 20 21 짝수일때 오름차순 홀수일떄 내림차순
 
 
3. <달팽이>
1   2  3  4  5  6   7
21 22 23 24 25 26   8
20             27     9 ㄱ
19             28    10 ㄴ 모양으로 입력되게끔 
18 17 16 15 14 13 12 11



*/