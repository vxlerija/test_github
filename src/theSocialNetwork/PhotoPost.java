package theSocialNetwork;

public class PhotoPost extends Messages {

	private String dataname;
	private String headline;

	public String getDataname() {
		return dataname;
	}

	public void setDataname(String dataname) {
		this.dataname = dataname;
	}
	
	public String getHeadline() {
		return headline;
	}
	
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public String toString() {
		return super.toString() + "\n\t" + "text: " + this.dataname + "\n\t" + "headline: " + this.headline;
	}

	@Override
	public void addLike() {
		// TODO Auto-generated method stub
		
	}
	
}
