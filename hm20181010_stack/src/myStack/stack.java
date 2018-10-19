package myStack;

/**
 * @author developer
 * ������ �迭�� ������.
 */
public class stack {
	public char[] stack;		// ����
	public int point = 0;		// ���� ����Ʈ
	
	public stack() {
		stack = new char[100];
	}
	
	/**
	 * ������ �ֻ����� ���� �߰��Ѵ�. 
	 * @param c
	 */
	public void push(char c) {
		// ������ �ֻ����� ���� �߰��Ѵ�. 
		this.stack[this.point] = c;
		this.point ++;
		return ;
	}
	
	/**
	 * ������ �ֻ����� ���� �����´�. 
	 * @return
	 */
	public char pop() {
		this.point--;
		char result = stack[this.point];
		this.stack[this.point] = '\0';
		return result;
	}
	
	/**
	 * ���� ������ ��� �����ش�.
	 */
	public void show() {
		for (int i = 0; i < this.point; i++) {
			System.out.print(this.stack[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * ������ ����ٸ� true�� ������� �ʴٸ� false�� ��ȯ�Ѵ�.
	 * @return ����ٸ� true / ������� �ʴٸ� false
	 */
	public Boolean IsEmpty() {
		return (this.point == 0 ? true : false);
	}
}
