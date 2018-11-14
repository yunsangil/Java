package customer_management;

class Customer {
	private String ID=null;
	private String name=null;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return ID +"/"+ name;
	}
}
