package word;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class vocabulary {
	ArrayList<Word> voca = new ArrayList<>();
	private Scanner in = new Scanner(System.in);

	vocabulary() {
		menu();
	}

	private void menu() {
		while (true) {
			init();
			int select = in.nextInt();
			in.nextLine();
			switch (select) {
			case 1:
				inputword();
				break;
			case 2:
				searchword();
				break;
			case 3:
				wordlist();
				break;
			case 4:
				delword();
				break;
			case 5:
				System.out.println("�����մϴ�.");
				in.close();
				return;
			default:
				System.out.println("1~5������ �Է��Ұ�");
			}
		}
	}

	private void wordlist() {
		System.out.println("����� �ܾ� ��� ");
		for (int i = 0; i < voca.size(); i++) {
			System.out.println((i + 1) + "." + voca.get(i));
		}
	}

	private void delword() {
		System.out.println("�ܾ� ����");
		System.out.print("���� ");
		wordlist();
		System.out.print("������ �ܾ� �Է� >>");
		String user_input = in.nextLine();
		for (int i = 0; i < voca.size(); i++) {
			if (voca.get(i).getEnglishWord().equals(user_input) || voca.get(i).getKoreanWord().equals(user_input)) {
				System.out.println(voca.get(i) + "�� �����մϴ�.");
				voca.remove(i);
			}
		}
	}

	private void init() {
		System.out.println("===========�� �� ��===========");
		System.out.println("1.�ܾ� �Է�");
		System.out.println("2.�ܾ� �˻�");
		System.out.println("3.�ܾ� ���");
		System.out.println("4.�ܾ� ����");
		System.out.println("5.�ܾ��� ����");
		System.out.println("===========================");
	}

	private void inputword() {
		System.out.println("�ܾ �Է����ּ���. ex)apple/���");
		while (true) {
			try {
				String user_input = in.nextLine();
				String[] splitword = user_input.split("/");

				Word userinput_word = new Word();
				userinput_word.setEnglishWord(splitword[0]);
				userinput_word.setKoreanWord(splitword[1]);
				user_input.substring(0, 6); // 0��°���� �����ؼ� 6��°����
				user_input.substring(6); // 6��°����
				voca.add(userinput_word);
				for (int i = 0; i < voca.size(); i++) {
					System.out.println(voca.get(i).getEnglishWord() + "/" + voca.get(i).getKoreanWord());
				}
				break;

			} catch (Exception e) {
				System.out.println("�Է����Ŀ� �����ʽ��ϴ�. �ٽ��Է����ּ���.");
			}

		}

	}

	private void searchword() {
		String judge = null;
		System.out.println("�˻� ����� ������ �����ϴ�.");
		System.out.println("a+b :a��� �ܾ� �Ǵ� b��� �ܾ ���ԵǴ� �ܾ� �˻�");
		System.out.println("~b :b�� ������ �ܾ� �˻�");
		System.out.println("a*b :a��� �ܾ�� ������b��� �ܾ�� ������ �ܾ� �˻�");
		System.out.print("�Է� >>");
		while (true) {
			int count = 0;
			String[] searchword = new String[2];
			try {
				String user_search = in.nextLine();
				for (int i = 0; i < user_search.length(); i++) {
					if (user_search.charAt(i) == '+') {
						judge = "plus";
						break;
					} else if (user_search.charAt(i) == '~') {
						judge = "minus";
						break;
					} else if (user_search.charAt(i) == '*') {
						judge = "multiply";
					}
				}
				StringTokenizer st = new StringTokenizer(user_search, "+~*");

				while (st.hasMoreTokens()) {
					searchword[count] = st.nextToken();
					System.out.println(searchword[count]);
					count++;
				}
				if (judge.equals("plus")) {
					System.out.println("a �Ǵ� b �ܾ� �˻� ����");
					for (int i = 0; i < voca.size(); i++) {
						if (voca.get(i).getEnglishWord().contains(searchword[0])) {
							System.out.println("1�� �˻� ���");
							System.out.println(voca.get(i).getKoreanWord());
						} else if (voca.get(i).getEnglishWord().contains(searchword[1])) {
							System.out.println("2�� �˻� ���");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("��ġ�ϴ� ����� ã�� �� �����ϴ�.");
						}
					}
				} 
				else if (judge.equals("minus")) {
					int count_search = 0;
					System.out.println("a�� ������ �ܾ� �˻� ����");
					int judgenumber = searchword[0].length();
					for (int i = 0; i < voca.size(); i++) {
						int judgenumber2 = voca.get(i).getEnglishWord().length();
						// judgenumber2 - judgenumber ~ judgenumber
						if (searchword[0].equals(
								voca.get(i).getEnglishWord().substring(judgenumber2 - judgenumber, judgenumber2))) {
							++count_search;
							System.out.println("�� " + count_search + "�� ��ŭ ã�ҽ��ϴ�!");
							System.out.println("ã�� �ܾ� : ");
							System.out.println(voca.get(i).getEnglishWord() + "/");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("��ġ�ϴ� ����� ã�� �� �����ϴ�.");
						}
					}
				} 
				else if (judge.equals("multiply")) {
					int count_search = 0;
					System.out.println("a�� �����ؼ� b�� ������ �ܾ� �˻� ����");
					int judgenumber = searchword[0].length();
					int judgenumber2 = searchword[1].length();
					for (int i = 0; i < voca.size(); i++) {
						int judgenumber3 = voca.get(i).getEnglishWord().length();
						// judgenumber2 - judgenumber ~ judgenumber
						if (searchword[0].equals(voca.get(i).getEnglishWord().substring(0, judgenumber))
								&& searchword[1].equals(voca.get(i).getEnglishWord()
										.substring(judgenumber3 - judgenumber2, judgenumber3))) {
							++count_search;
							System.out.println("�� " + count_search + "�� ��ŭ ã�ҽ��ϴ�!");
							System.out.println("ã�� �ܾ� : ");
							System.out.println(voca.get(i).getEnglishWord() + "/");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("��ġ�ϴ� ����� ã�� �� �����ϴ�.");
						}
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("�ٽ� �Է����ּ���. �˻� ��Ŀ� ���� �ʽ��ϴ�.");
			}
		}

	}
}