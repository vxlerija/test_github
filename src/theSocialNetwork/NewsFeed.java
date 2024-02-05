package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	private ArrayList<Messages> entrys;
	
	public void addPost(Messages entry) {
		this.entrys.add(entry);
	}
	
	public void removePost(Messages entry) {
		this.entrys.remove(entry);
	}

}
