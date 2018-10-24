package business_log_Administration;

import java.util.ArrayList;
import business_log_Document.Work_Content;

public class business_log {

	private int log_year, log_month, log_day; // 생성자 처음 생성할때 입력하는 작성일자
	private int limit_year, limit_month, limit_day; // 만료일자
	private String Work;
	private String WorkNum;
	public ArrayList<Work_Content> WorkContent = new ArrayList<>();

	public String getWorkNum() {
		return WorkNum;
	}

	public void setWorkNum(String workNum) {
		WorkNum = workNum;
	}

	public business_log(int year, int month, int day) // 입력한 값을 log_year,month,day에 그대로 입력
	{
		this.log_year = year;
		this.log_month = month;
		this.log_day = day;
	}

	public int getLog_year() {
		return log_year;
	}

	public int getLog_month() {
		return log_month;
	}

	public int getLog_day() {
		return log_day;
	}

	public int getLimit_year() {
		return limit_year;
	}

	public void setLimit_year(int limit_year) {
		this.limit_year = limit_year;
	}

	public void setLog_year(int log_year) {
		this.log_year = log_year;
	}

	public void setLog_month(int log_month) {
		this.log_month = log_month;
	}

	public void setLog_day(int log_day) {
		this.log_day = log_day;
	}

	public int getLimit_month() {
		return limit_month;
	}

	public void setLimit_month(int limit_month) {
		this.limit_month = limit_month;
	}

	public int getLimit_day() {
		return limit_day;
	}

	public void setLimit_day(int limit_day) {
		this.limit_day = limit_day;
	}

	public String toString() { // business_log를 출력할때 반환되는 String
								// 추후에 log_year,month,day나 limit_year,month,day는 남은 일자 계산에 활용되므로
								// 형변환 없이 쓰기 위해 int형을 주었지만 표현 방식에는 String이 나을것 같아 이렇게 함
		return log_year + "년" + log_month + "월" + log_day + "일";
	}

	public String toString2() {
		return limit_year + "년" + limit_month + "월" + limit_day + "일";
	}

	public String toString3() {
		return " 업무번호 :" + WorkNum + " 업무명 :" + Work;
	}

	public String toString4() { // 메소드가 다양해짐에 따라 메인으로 사용하는 business_log의 반환값이 많아졌다..
		return "시작일 : " + toString() + " 만료일 : " + toString2() + toString3();
	}

	public String getWork() {
		return Work;
	}

	public void setWork(String work) {
		this.Work = work;
	}

}
