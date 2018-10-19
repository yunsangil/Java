package myStack;

//String temp = "327x+34x-"
//String
public class MyStack {

	char[] myStack = null;
	int stackPointer = -1;
	int calc = 0;

	public MyStack(int size) {
		myStack = new char[size];
	}

	
//	public void myCalc() {
//		String temp = "327*+34*-";
//		//연산자, 피연산자
//		
//		for (int i = 0; i < temp.length(); i++) {
//			if (temp.charAt(i) == '*' || temp.charAt(i) == '-' || temp.charAt(i) == '/' || temp.charAt(i) == '+') {
//
//				String pop1 = pop();
//				String pop2 = pop();
//				if (temp.charAt(i) == '*') {
//					System.out.println("곱하기 연산 실행");
//					calc = Integer.parseInt(pop2) * Integer.parseInt(pop1);
//				} else if (temp.charAt(i) == '-') {
//					System.out.println("빼기 연산 실행");
//					calc = Integer.parseInt(pop2) - Integer.parseInt(pop1);
//				} else if (temp.charAt(i) == '/') {
//					calc = Integer.parseInt(pop2) / Integer.parseInt(pop1);
//				} else if (temp.charAt(i) == '+') {
//					System.out.println("더하기 연산 실행"); 
//					calc = Integer.parseInt(pop2) + Integer.parseInt(pop1);
//				}
//				System.out.println("연산 결과 : " + calc);
//				push(String.valueOf(calc));
//
//			} else {
//				push(String.valueOf(temp.charAt(i)));
//			}
//
//		}
//	}
	// ch63zb3948
	//char a = temp.charAt(i) 2*7 
	//48 = 0
	//49 = 1
	//50 = 2
	//51 = 3
	//52 = 4
	//53 = 5
	//54 = 6
	//55 = 7
	//56 = 8
	//57 = 9
	

	
	
	public void push(char data) {
		stackPointer++;
		myStack[stackPointer] = data;
	}

	public char pop() {
		char data = myStack[stackPointer];
		//myStack[stackPointer] = null;

		stackPointer--;
		return data;
	}
	public char stackTop() {
		if(stackPointer <= -1) {
			return 'N';
		}
		return myStack[stackPointer];
	}
//	public int arrayLength() {
//		for (int i = 0; i < myStack.length; i++) {
//			if (myStack[i] == 'N') {
//				break;
//			}
//			return i - 1;
//		}
//		return -1;
//	}
//	public static int typeCon(char c) {
//		return c-48;
//	}
//	public Boolean IsEmpty() {
//		return (this.stackPointer == -1 ? true : false);
//	}
}