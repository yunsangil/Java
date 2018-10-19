package ArrayEx;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayEx3C {
	/*
	 * 3. 홀수 오름차순 정렬 짝수 내림차순 정렬
	 */
	public static void main(String[] args) {
		int [] number = {1,2,3,4,5,6,7,8,9};
		int compare=0;
		ArrayList <Integer> odd = new ArrayList <Integer>();
		ArrayList <Integer> even = new ArrayList <Integer>();
		for(int i=0;i<number.length;i++)
		{
			compare=number[i];
			if(compare%2==1)
			{
				odd.add(compare);
			}
			else if(compare%2==0)
			{
				even.add(compare);
			}
		}
		Collections.sort(odd);
		Collections.sort(even,Collections.reverseOrder());
		Iterator<Integer> oddresult = odd.iterator();
		Iterator<Integer> evenresult = even.iterator();
		while(oddresult.hasNext()||evenresult.hasNext())
		{
			if(oddresult.hasNext()==true)
			{
				System.out.print(oddresult.hasNext());
			}
			if(evenresult.hasNext()==true)
			{
				System.out.print(evenresult.hasNext());	
			}
			else {
				break;
			}
		}
}
}
