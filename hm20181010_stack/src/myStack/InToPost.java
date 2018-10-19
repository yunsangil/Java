package myStack;

public class InToPost {

	public String infix="";
	private String postfix="";
	private String number = "0123456789";
	private MyStack mystack;

	InToPost(String data) {
		this.infix = data;
		mystack = new MyStack(infix.length());
		process();
	}

	// String temp = "327*+34*-";
	private void process() {
		for (int i = 0; i < infix.length(); i++) {
			char imsi = infix.charAt(i);

			if (imsi == '(') {
				mystack.push(imsi);
			} else if (chknumber(imsi)) {
				postfix = postfix + imsi;
			} else if (imsi == ')') {
				whileStackPop();
				mystack.pop();
			} else {
				int imsiPri = priority(imsi);
				int stackPri = priority(mystack.stackTop());
				if (imsiPri > stackPri) {
					mystack.push(imsi);
//					System.out.println(imsi +"stack push");
				} else if (imsiPri <= stackPri) {

					whileStackPop();

					mystack.push(imsi);
				}
			}
		}
		stackclear();
	}
	private void whileStackPop() {
		
		while (mystack.stackTop() != '(' && mystack.stackTop() != 'N') {

			char stackOutData = mystack.pop();
//			System.out.println(stackOutData + "stack pop");
			postfix = postfix + stackOutData;
		}
	}
	
	private void stackclear() {
		while(mystack.stackTop()!='N') {
			postfix = postfix + mystack.pop();
		}
	}
	
	private int priority(char a) {
		switch (a) {
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
			return 3;
		default:
			return 0;
		}
	}

	private boolean chknumber(char a) {
		for (int i = 0; i < number.length(); i++) {
			if (a == number.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	public String getPost() { // infix ->postfix ¹ÝÈ¯
		if (postfix != null) {
			return postfix;
		}
		return null;
	}

}
