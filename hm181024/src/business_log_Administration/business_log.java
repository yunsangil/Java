package business_log_Administration;

import java.util.ArrayList;
import business_log_Document.Work_Content;

public class business_log {

	private int log_year, log_month, log_day; // ������ ó�� �����Ҷ� �Է��ϴ� �ۼ�����
	private int limit_year, limit_month, limit_day; // ��������
	private String Work;
	private String WorkNum;
	public ArrayList<Work_Content> WorkContent = new ArrayList<>();

	public String getWorkNum() {
		return WorkNum;
	}

	public void setWorkNum(String workNum) {
		WorkNum = workNum;
	}

	public business_log(int year, int month, int day) // �Է��� ���� log_year,month,day�� �״�� �Է�
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

	public String toString() { // business_log�� ����Ҷ� ��ȯ�Ǵ� String
								// ���Ŀ� log_year,month,day�� limit_year,month,day�� ���� ���� ��꿡 Ȱ��ǹǷ�
								// ����ȯ ���� ���� ���� int���� �־����� ǥ�� ��Ŀ��� String�� ������ ���� �̷��� ��
		return log_year + "��" + log_month + "��" + log_day + "��";
	}

	public String toString2() {
		return limit_year + "��" + limit_month + "��" + limit_day + "��";
	}

	public String toString3() {
		return " ������ȣ :" + WorkNum + " ������ :" + Work;
	}

	public String toString4() { // �޼ҵ尡 �پ������� ���� �������� ����ϴ� business_log�� ��ȯ���� ��������..
		return "������ : " + toString() + " ������ : " + toString2() + toString3();
	}

	public String getWork() {
		return Work;
	}

	public void setWork(String work) {
		this.Work = work;
	}

}
