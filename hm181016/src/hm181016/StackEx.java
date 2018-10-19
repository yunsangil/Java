package hm181016;

public class StackEx {
	// FILO, LIFO, pop, push
	int a = 10;
	private int[] myStack = new int[a];
	private int stackPointer = -1;
	
//	private int pop() {
//		if(stackPointer==-1)
//		{
//			return 0000;
//		}
//		
//		int imsi = myStack[stackPointer];
//		stackPointer--;
//		return imsi;
//	}
//	private boolean push(int data) {
//		if(stackPointer == myStack.length-1) {
//			return false;
//		}
//		
//		stackPointer++;
//		myStack[stackPointer]=data;
//		return true;
//	}
	public int pop() {
		int imsi = myStack[stackPointer];
		stackPointer--;
		return imsi;
	}
	public void push(int data) {
		stackPointer++;
		myStack[stackPointer] = data;
	}
	public int nowStackPoint() {
		return stackPointer;
	}
	public int viewStackTop() {
		if(stackPointer==-1) {
			return 0000;
		}
		return myStack[stackPointer];
	}
	
	
}
