package theSocialNetwork;

public class Comment {
	
	private String user;
	private String text;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	@Override
	public String toString() {
		return "user: " + this.user + "\n\t" + "text: " + this.text;
	}
	
	
	

}
