package hm181016;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*Ŭ���� �̸�*/	StackEx myS=new StackEx(); //������
		for(int i=1; i<=9; i++)
		{
			if(i%3==0){
				myS.push(i);
				while(myS.nowStackPoint()!=-1) {
					System.out.println(myS.pop());
				}
			}
			else {
				myS.push(i);
			}
		}

	}

}
