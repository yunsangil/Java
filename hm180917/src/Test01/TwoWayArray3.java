package Test01;

public class TwoWayArray3 {
	public static void main(String[] args) {
		int[][] TwoWayArray = new int[5][7];
		int count = 1;
		int x = 0;
		int y = -1;
		int n=TwoWayArray[0].length;
		int increase=1;
		while(n>2) {
			for(int i=0;i<n;i++)
			{
				y +=increase;
				TwoWayArray[x][y]=count;
				count++;
			}
			n--;
			if(n==0)
			{
				break;
			}
			for(int i=0;i<n-2;i++)
			{
				x += increase;
				TwoWayArray[x][y]=count;
				count++;
			}
			increase *= -1;
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{

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

4. <사선채우기>
 1  2  4  7 11 16 21 //1 2 3 4 5 5 
 3  5  8 12 17 22 26 //2 3 4 5 5 4  
 6  9 13 18 23 27 30 //3 4 5 5 4 3
 10 14 19 24 28 31 33//4 5 5 4 3 2
 15 20 25 29 32 34 35//5 5 4 3 2 1
*/