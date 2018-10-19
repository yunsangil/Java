package Gugu;

public class selfnumber2 {
	    private static final int SIZE = 5000;
	    private static boolean[] flags = new boolean[SIZE+1];
	    private static int d(int n) {
	        int result = n;
	        char[] digits = String.valueOf(n).toCharArray();
	        for( int i=0; i<digits.length; i++ ) {
	            result += digits[i] - '0';
	        }
	        return result;
	    }
	    public static void main(String args[]) {
	        int temp;
	        int sum=0;
	        for(int i=1; i<=SIZE; i++) {
	            if( !flags[i] ) 
	            	{
	            	sum+=i;
	            	}
	            temp = d(i);
	            if( temp <= SIZE ) flags[temp] = true;
	        }

        	System.out.println(sum);
	    }
	}
