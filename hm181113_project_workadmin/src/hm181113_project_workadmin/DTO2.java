package hm181113_project_workadmin;

public class DTO2 {
	int index;
	String w_name;
	String progress_data;
	
	DTO2(int index,String w_n,String p_d)
	{
		this.index = index;
		this.w_name = w_n;
		this.progress_data = p_d;
	}
	DTO2(String w_n,String p_d)
	{
		this.w_name = w_n;
		this.progress_data = p_d;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public String getProgress_data() {
		return progress_data;
	}
	public void setProgress_data(String progress_data) {
		this.progress_data = progress_data;
	}

	public String toString() {
		
		return index+"/"+w_name+"/"+progress_data;
	}
}
