package bowling;

import java.util.Random;
import java.util.Scanner;

class calc_point {
	public static final int pins = 10;
	private int result, result2 = 0, result3 = 0, result4 = 0;

	private Random RBIpins = new Random();
	private Scanner in = new Scanner(System.in);
	private int userrandnum = 0, cpuselect = 0;
	private char[][] countpoint = new char[2][10];
	private int[] savepoint = new int[10];
	private int calcpoint;
	static boolean flag = false;
	static boolean flag2 = false;

	calc_point() {
		bowling();
	}

	void bowling() {
		System.out.println("���� �����Դϴ�!");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("���� " + (i + 1) + "������ ° ���� �������Դϴ�.");
			if (flag == true) {

				if (flag2 == false) {
					System.out.println("����� ���� ��Ʈ����ũ ���ʽ� 10�� + ���� ������ 1,2�� ���� : " + (20 - (result2 + result4)));
					calcpoint += 10+(pins - (result2 + result4));
					savepoint[i - 1] = calcpoint;

				} else if (flag2 == true) {
					System.out.println("��Ʈ����ũ ���ʽ� 10�� + ���� ������ 1,2�� ���� : " + 20);
		
				}
			}
			flag = first_throw();
			if (i<9&&flag2 == true) {
				System.out.println("���� �������� ����� ó�� ���ʽ��� �̹� �������� 1���� ������ �ջ�˴ϴ�!");
				System.out.println("����� ���ʽ� 10�� +�̹� ������ 1�� ���� : " + (10 + result2));
				calcpoint += (10 + result2);
				savepoint[i - 1] = calcpoint;
			}

			if (flag == false) {
				System.out.println("���� �ɼ���" + result + "�� �Դϴ�");
				flag2 = second_throw();
			}
			if(i==9&&flag2==true)
			{
				System.out.println("������ ������ ���ʽ� �����Դϴ�!");
				first_throw();
				System.out.println(result2+"����ŭ ����Ʈ���̽��ϴ�!");
				calcpoint += 10 + result2;
				savepoint[9] = calcpoint;
			}
			if (flag == true) {
				countpoint[0][i] = 'X';
				countpoint[1][i] = ' ';
				System.out.println("�̹� �������� ��Ʈ����ũ ó�� ���ʽ��� ���� �������� 1,2�� ������ �ջ�˴ϴ�!");
				
			} else {
				countpoint[0][i] = (char) (result2 + 48);
				countpoint[1][i] = (char) (result4 + 48);
				int counttest = countpoint[0][i] + countpoint[1][i];
				if (counttest == 106) {
					countpoint[1][i] = '-';
				} else {

					calcpoint += result2 + result4;
					savepoint[i] = calcpoint;
				}
			}
			for (int j = 0; j < 10; j++) {
				if (countpoint[0][j] > 48 && countpoint[0][j] < 58 || countpoint[0][j] == 88) {
					System.out.print(countpoint[0][j] + "/" + countpoint[1][j] + "|||");
				}
			}
			System.out.println();
			for (int k = 0; k < 10; k++) {

				if (savepoint[k] != 0) {
					System.out.print(" " + savepoint[k] + "|||");
				}
			}
		}
	}

	boolean first_throw() {
		System.out.println("�Է� start : ����");
		String userselect = in.nextLine();
		if (userselect.equals("start")) {

			cpuselect = RBIpins.nextInt(10) + 1; // 1���� 10����
			userrandnum = RBIpins.nextInt(10) + 1; // 1���� 10����
			if (cpuselect > userrandnum) {
				result = cpuselect - userrandnum;
			} else if (userrandnum > cpuselect) {
				result = userrandnum - cpuselect;
			}
			if (userrandnum == cpuselect) {
				System.out.println("��Ʈ����ũ!");
				result = 0;
				result2 = 10;
				return true;
			}
			result2 = pins - result; // result2 -- ����Ʈ�� ����

		} else {
			System.out.println("'start'��� �ٽ� �Է����ּ���.");
			first_throw();
		}
		return false;
	}

	boolean second_throw() {
		System.out.println("2��° �Դϴ�. �Է� start : ����");
		String userselect = in.nextLine();
		if (userselect.equals("start")) {

			cpuselect = RBIpins.nextInt(10) + 1; // 1���� 10����
			userrandnum = RBIpins.nextInt(10) + 1; // 1���� 10����
			if (cpuselect > userrandnum) {
				result3 = cpuselect - userrandnum;
			} else if (userrandnum > cpuselect) {
				result3 = userrandnum - cpuselect;
			}
			if (userrandnum == cpuselect) {
				System.out.println("�Ŀ�!");
				result4 = 0;

			} else {
				if (result3 >= result) {
					System.out.println("�����ó�� ����!");
					result4 = result;
					return true;
				} else {
					System.out.println("����� ó�� ����!");
					result4 = result - result3;
				}
			}

		} else {
			System.out.println("'start'��� �ٽ� �Է����ּ���.");
			second_throw();
		}
		return false;
	}

}
