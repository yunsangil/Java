package hm181113_project_workadmin;

public class DTO {
	String w_name;
	String Start_date;
	String End_date;
	String statement;
	
	DTO(String w_n,String S_d,String e_d, String stmt)
	{
		this.w_name = w_n;
		this.Start_date = S_d;
		this.End_date = e_d;
		this.statement = stmt;
	}	
	DTO(String w_n,String S_d,String e_d)
	{
		this.w_name = w_n;
		this.Start_date = S_d;
		this.End_date = e_d;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public String getStart_date() {
		return Start_date;
	}
	public void setStart_date(String start_date) {
		Start_date = start_date;
	}
	public String getEnd_date() {
		return End_date;
	}
	public void setEnd_date(String end_date) {
		End_date = end_date;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String toString() {
		return w_name+"/"+Start_date+"/"+End_date+"/"+statement;
	}

}
