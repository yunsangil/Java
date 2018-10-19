package TTTTest;

public class Member {


	public String name = null;

	public static String c = "1class";
//  접근권한   정책
	private final int value;

	public Member(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
