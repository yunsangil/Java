package Typing;

import java.util.Random;
import java.util.Scanner;

public class Typing2 {

	static String[] TypingArray = new String[50];
	static int index = 0, correct = 0;

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		Arraylist();
		boolean trueorfalse = true;
		while (trueorfalse) {
			correct = 0;

			System.out.println(Print_for_typing());

			System.out.println("1은 시작, 3을 입력하시면 종료됩니다. 나머지 숫자를 입력하실 경우, 통과됩니다.");
			int startline = in.nextInt();
			in.nextLine(); //엔터 홀딩
			
			
			if (startline == 3) { //반복문 종료
				System.out.println("종료됩니다.");
				trueorfalse = false;
			}
			else if (startline == 1) { //1을 입력받으면 시작
				System.out.println("측정 시작합니다.");
				long beginTime = System.currentTimeMillis(); //시간 측정 시작
				String user_typing = in.nextLine();

				Typing_program(user_typing);
				int incorrect = TypingArray[index].length() - correct; //오타 수 : 전체 길이 - 정타 수
				float a = TypingArray[index].length(); 
				float b = correct;
				float percent = b / a;
				System.out.println(
						"전체 타수 :" + TypingArray[index].length() + " 맞게 친 수 :" + correct + " 틀린 수 :" + incorrect);

				long endTime = System.currentTimeMillis(); //시간 측정 종료
				long ms = endTime - beginTime;
				float sec = (float) ms / 1000;
				float min = (float) sec / 60;
				float result = correct/sec*60;
				System.out.printf("타수 : %.0f타\n",correct / sec * 60); // (타수) / 경과시간(초) * 60초
				System.out.printf("정확도 : %.0f %%\n",percent * 100);
				System.out.println();
			}
			else{ //아닐 경우 통과
				System.out.println("통과합니다.");
				System.out.println();
			}
		}
	}

	public static void Arraylist() {
		TypingArray[0] = "Good words are worth much, and cost little";
		TypingArray[1] = "The right people in the right jobs";
		TypingArray[2] = "Experience is the only prophecy of wise men";
		TypingArray[3] = "A man apt to promise is apt to forget";
		TypingArray[4] = "Mere decay produces richer life";
		TypingArray[5] = "United we stand, divided we fall";
		TypingArray[6] = "Man will do many things to get himself loved";
		TypingArray[7] = "The first virtue of a painting is to be a feast for the eyes";
		TypingArray[8] = "Faith which does not doubt is dead faith";
		TypingArray[9] = "A big fish in a little pond";
		TypingArray[10] = "He that increases knowledge increases sorrows";
		TypingArray[11] = "Use makes perfect";
		TypingArray[12] = "It is a wise father that knows his own child";
		TypingArray[13] = "Brevity is the soul of wit";
		TypingArray[14] = "Our bodies are our gardens, to the which our wills are gardeners";
		TypingArray[15] = "Life is a progress from want to want, not from enjoyment to enjoyment";
		TypingArray[16] = "Brevity is the soul of wit";
		TypingArray[17] = "One cannot see the wood for the trees";
		TypingArray[18] = "Know thyself";
		TypingArray[19] = "A brave man or fortunate one is able to bear envy";
		TypingArray[20] = "They that govern the most make the least noise";
		TypingArray[21] = "Conviction is worthleses till it converts itself into conduct";
		TypingArray[22] = "Question is not answer";
		TypingArray[23] = "A bird in the hand is worth two in the bush";
		TypingArray[24] = "If you are idle, be not solitary, if you are solitary, be not idle";
		TypingArray[25] = "Nothing can bring you peace but yourself";
		TypingArray[26] = "A man of many talents";
		TypingArray[27] = "Time is the rider that breaks youth";
		TypingArray[28] = "Eat to live, and not live to eat";
		TypingArray[29] = "Frailty, thy name is woman";
		TypingArray[30] = "Of the people, by the people, for the people";
		TypingArray[31] = "What the heart thinks, the mouth speaks";
		TypingArray[32] = "He that conceals his grief finds no remedy for it";
		TypingArray[33] = "The past one can know, but the future feel";
		TypingArray[34] = "A learned fool is more foolish than an ignorant one";
		TypingArray[35] = "Years know more than books";
		TypingArray[36] = "Use makes perfect";
		TypingArray[37] = "A light heart lives long";
		TypingArray[38] = "The best of prophets of the future is the past";
		TypingArray[39] = "Things are always at their best in their beginning";
		TypingArray[40] = "The eternal silence of these infinite spaces terrifies me";
		TypingArray[41] = "You never miss the water till the well runs dry";
		TypingArray[42] = "There are three faithful friends-an old wife, an old dog, and money";
		TypingArray[43] = "It is better to be Socrates dissatisfied than a pig satisfied";
		TypingArray[44] = "What is reasonable is real; that which is real is reasonable";
		TypingArray[45] = "All the world's stage, and all the men and women merely players";
		TypingArray[46] = "A dram of discretion is worth a pound of wisdom";
		TypingArray[47] = "Many strokes fell great oaks";
		TypingArray[48] = "A fog cannot be dispelled with a fan";
		TypingArray[49] = "Nature is the glass reflecting God";

	}

	public static String Print_for_typing() {
		Random r = new Random();
		index = r.nextInt(49);
		return TypingArray[index];
	}

	public static void Typing_program(String input) {
		if(TypingArray[index].length() <= input.length())
		{
		for (int i = 0; i < TypingArray[index].length(); i++) {
			if (input.charAt(i) == TypingArray[index].charAt(i)) {
				correct++;
			}
		}
		}
		else {

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == TypingArray[index].charAt(i)) {
					correct++;
				}
			}
		}
	}

}
