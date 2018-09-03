package box;


public class box {
	
	int width,length,height;
	
	
	public int getwidth(){
		
		return this.width;
	}
	public int getlength(){
		
		return this.length;
	}
	public int getheight(){
		
		return this.height;
	}
	public void setwidth(int width){
		this.width=width;
	}
	public void setlength(int length){
		this.length=length;
	}
	public void setheight(int height){
		this.height=height;
	}
	
	public int getVolume()
	{
		return width*length*height;
	}
	
	public void printbox(){
		
		System.out.println("너비:"+getwidth());
		System.out.println("길이:"+getlength());
		System.out.println("높이:"+getheight());
	}
	
}
