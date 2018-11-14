package KaKaoStar;

import java.util.ArrayList;

public class GameOne {
	private int num = 0;
	private ArrayList<String> option = new ArrayList<>();
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ArrayList<String> getOption() {
		return option;
	}
	public void addOption(String op) {
		option.add(op);
	}
	public void prt() {
		System.out.print(num +" / ");
		for(int i=0;i<option.size();i++) {
			System.out.print(option.get(i) +" | ");
		}
	}
	public int cal() {
		int sum=num;
		for(int i=0;i<option.size();i++) {
			String data = option.get(i);
			System.out.println("Data : "+data);
			switch(data) {
			case "S":
			case "s":
				sum = (int) Math.pow(sum, 1);
				break;
			case "d":
			case "D":
				sum = (int) Math.pow(sum, 2);
				break;
			case "t":
			case "T":

				sum = (int) Math.pow(sum, 3);
				System.out.println(sum);
				break;
			case "*":
				sum = sum * 2;
				break;
			case "#":
				sum = sum* -1;
				break;
				default:
			}
		}
		return sum;
	}
}
