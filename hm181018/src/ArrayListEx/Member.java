package ArrayListEx;

public class Member {
	private String id = null;
	private String name = null;
	private String pwd = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void viewInfo() {
		System.out.println("사용자 이름 : "+getName());
		System.out.println("사용자 아이디 : "+getId());
	}
}
