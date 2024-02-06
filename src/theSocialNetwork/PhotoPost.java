package theSocialNetwork;

public class PhotoPost extends Messages {

	private String dataname;

	public String getDataname() {
		return dataname;
	}

	public void setDataname(String dataname) {
		this.dataname = dataname;
	}
	
	public String toString() {
		return super.toString() + "\n\t" + "text: " + this.dataname;
	}
	
}
