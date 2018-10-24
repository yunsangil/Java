package business_log_Document;

public class Work_Content {
	private String time;
	private String Content;
	private String ContentNum;

	public String getContentNum() {
		return ContentNum;
	}

	public void setContentNum(String contentNum) {
		ContentNum = contentNum;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getTime() {
		return time;
	}

	public String toString() {
		return "내용번호 :"+ContentNum + " 시간 :" + time + " 내용 :" + Content;
	}

	public String getContent() {
		return Content;
	}
}
