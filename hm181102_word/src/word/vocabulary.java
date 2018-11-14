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
				System.out.println("종료합니다.");
				in.close();
				return;
			default:
				System.out.println("1~5까지만 입력할것");
			}
		}
	}

	private void wordlist() {
		System.out.println("저장된 단어 목록 ");
		for (int i = 0; i < voca.size(); i++) {
			System.out.println((i + 1) + "." + voca.get(i));
		}
	}

	private void delword() {
		System.out.println("단어 삭제");
		System.out.print("현재 ");
		wordlist();
		System.out.print("삭제할 단어 입력 >>");
		String user_input = in.nextLine();
		for (int i = 0; i < voca.size(); i++) {
			if (voca.get(i).getEnglishWord().equals(user_input) || voca.get(i).getKoreanWord().equals(user_input)) {
				System.out.println(voca.get(i) + "를 삭제합니다.");
				voca.remove(i);
			}
		}
	}

	private void init() {
		System.out.println("===========단 어 장===========");
		System.out.println("1.단어 입력");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 목록");
		System.out.println("4.단어 삭제");
		System.out.println("5.단어장 종료");
		System.out.println("===========================");
	}

	private void inputword() {
		System.out.println("단어를 입력해주세요. ex)apple/사과");
		while (true) {
			try {
				String user_input = in.nextLine();
				String[] splitword = user_input.split("/");

				Word userinput_word = new Word();
				userinput_word.setEnglishWord(splitword[0]);
				userinput_word.setKoreanWord(splitword[1]);
				user_input.substring(0, 6); // 0번째에서 시작해서 6번째까지
				user_input.substring(6); // 6번째부터
				voca.add(userinput_word);
				for (int i = 0; i < voca.size(); i++) {
					System.out.println(voca.get(i).getEnglishWord() + "/" + voca.get(i).getKoreanWord());
				}
				break;

			} catch (Exception e) {
				System.out.println("입력형식에 맞지않습니다. 다시입력해주세요.");
			}

		}

	}

	private void searchword() {
		String judge = null;
		System.out.println("검색 방식은 다음과 같습니다.");
		System.out.println("a+b :a라는 단어 또는 b라는 단어가 포함되는 단어 검색");
		System.out.println("~b :b로 끝나는 단어 검색");
		System.out.println("a*b :a라는 단어로 시작해b라는 단어로 끝나는 단어 검색");
		System.out.print("입력 >>");
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
					System.out.println("a 또는 b 단어 검색 형식");
					for (int i = 0; i < voca.size(); i++) {
						if (voca.get(i).getEnglishWord().contains(searchword[0])) {
							System.out.println("1번 검색 결과");
							System.out.println(voca.get(i).getKoreanWord());
						} else if (voca.get(i).getEnglishWord().contains(searchword[1])) {
							System.out.println("2번 검색 결과");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("일치하는 결과를 찾을 수 없습니다.");
						}
					}
				} 
				else if (judge.equals("minus")) {
					int count_search = 0;
					System.out.println("a로 끝나는 단어 검색 형식");
					int judgenumber = searchword[0].length();
					for (int i = 0; i < voca.size(); i++) {
						int judgenumber2 = voca.get(i).getEnglishWord().length();
						// judgenumber2 - judgenumber ~ judgenumber
						if (searchword[0].equals(
								voca.get(i).getEnglishWord().substring(judgenumber2 - judgenumber, judgenumber2))) {
							++count_search;
							System.out.println("총 " + count_search + "개 만큼 찾았습니다!");
							System.out.println("찾은 단어 : ");
							System.out.println(voca.get(i).getEnglishWord() + "/");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("일치하는 결과를 찾을 수 없습니다.");
						}
					}
				} 
				else if (judge.equals("multiply")) {
					int count_search = 0;
					System.out.println("a로 시작해서 b로 끝나는 단어 검색 형식");
					int judgenumber = searchword[0].length();
					int judgenumber2 = searchword[1].length();
					for (int i = 0; i < voca.size(); i++) {
						int judgenumber3 = voca.get(i).getEnglishWord().length();
						// judgenumber2 - judgenumber ~ judgenumber
						if (searchword[0].equals(voca.get(i).getEnglishWord().substring(0, judgenumber))
								&& searchword[1].equals(voca.get(i).getEnglishWord()
										.substring(judgenumber3 - judgenumber2, judgenumber3))) {
							++count_search;
							System.out.println("총 " + count_search + "개 만큼 찾았습니다!");
							System.out.println("찾은 단어 : ");
							System.out.println(voca.get(i).getEnglishWord() + "/");
							System.out.println(voca.get(i).getKoreanWord());
						}
						else {
							System.out.println("일치하는 결과를 찾을 수 없습니다.");
						}
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("다시 입력해주세요. 검색 방식에 맞지 않습니다.");
			}
		}

	}
}