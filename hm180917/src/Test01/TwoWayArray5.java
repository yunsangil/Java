package Test01;

public class TwoWayArray5 {

	static int x=1,y=0;
	public static void main(String[] args) {
		int[][] TwoWayArray = new int[5][5];
		int[][] TwoWayArray2 = new int[5][5];
		/*
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 *  6  1  2  3  4  ㄱ
		 * 11 12  7  8  5 ㄹ
		 * 16 17 13  9 10  늘여놓은ㄹ
		 * 21 18 19 14 15 ㄹ
		 * 22 23 24 25 20 역ㄴ
		 */
		int indexx=0,indexy=0;
		int number=1;
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
		
		
//		TwoWayArray2[indexx][indexy]=TwoWayArray[x][y];
//		x--;
//		indexy++;
//		TwoWayArray2[indexx][indexy]=TwoWayArray[x][y];
//		if(x==0&&y==0)
//		{
//			for(y=0;y<5;y++)
//			{
//				if(y==4)
//				{
//					indexx++;
//				}
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y];
//				indexy++;
//				
//			}
//		}
//		else if(y==4) {
//			for(x=1;x<5;x++) {
//				indexx++;
//				if(x==4)
//				{
//					indexx--;
//					indexy--;
//				}
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y];
//				
//			}
//		}
//		else if(x==4) {
//			for(y=4;y<=0;y--) {
//				indexy--;
//				if(y==0)
//				{
//					indexy++;
//					indexx--;
//				}
//				
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y]; //3,0 =4,0까지
//			}
//		}
//		else if(y==0) {
//			for(x=3;x<=2;x--) {
//				indexx--;
//				
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y]; //1,0 = 2,0까지
//				
//			}
//		}
//		else if(x==2) {
//			for(y=1;y<=1;y++) {
//				indexy++;
//				
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y]; //1,1 = 2,1까지
//			}
//		}
//		else if(y==1) {
//			indexy++;
//			for(x=1;x<=1;x++)
//			{
//				indexy++;
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y]; //1,2 = 1,1 까지
//			
//			}
//			}
//		else if(x==1)
//		{
//			for(y=2;y<=3;y++) {
//
//				indexy++;
//				if(y==3) {
//					indexx++;
//					indexy--;
//				}
//				TwoWayArray2[indexx][indexy]=TwoWayArray[x][y]; //2,3=1,3까지
//				
//				
//			}
//		}
		TwoWayArray2[0][0]=TwoWayArray[1][0];
		TwoWayArray2[0][1]=TwoWayArray[0][0];
		TwoWayArray2[0][2]=TwoWayArray[0][1];
		TwoWayArray2[0][3]=TwoWayArray[0][2];
		TwoWayArray2[0][4]=TwoWayArray[0][3];
		TwoWayArray2[1][4]=TwoWayArray[0][4];
		TwoWayArray2[2][4]=TwoWayArray[1][4];
		TwoWayArray2[3][4]=TwoWayArray[2][4];
		TwoWayArray2[4][4]=TwoWayArray[3][4];
		TwoWayArray2[4][3]=TwoWayArray[4][4];
		TwoWayArray2[4][2]=TwoWayArray[4][3];
		TwoWayArray2[4][1]=TwoWayArray[4][2];
		TwoWayArray2[4][0]=TwoWayArray[4][1];
		TwoWayArray2[3][0]=TwoWayArray[4][0];
		TwoWayArray2[2][0]=TwoWayArray[3][0];
		TwoWayArray2[1][0]=TwoWayArray[2][0];
		TwoWayArray2[1][1]=TwoWayArray[2][1];
		TwoWayArray2[1][2]=TwoWayArray[1][1];
		TwoWayArray2[1][3]=TwoWayArray[1][2];
		TwoWayArray2[2][3]=TwoWayArray[1][3];
		TwoWayArray2[3][3]=TwoWayArray[2][3];
		TwoWayArray2[3][2]=TwoWayArray[3][3];
		TwoWayArray2[3][1]=TwoWayArray[3][2];
		TwoWayArray2[2][1]=TwoWayArray[3][1];
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(TwoWayArray2[i][j]+"/");
			}
			System.out.println();
		}
		
		
		
	}
}