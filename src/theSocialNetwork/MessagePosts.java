package theSocialNetwork;

public class MessagePosts extends Messages {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return super.toString() + "\n\t" + "text: " + this.text;
	}

	@Override
	public void addLike() {
		// TODO Auto-generated method stub
		
	}
	

}
