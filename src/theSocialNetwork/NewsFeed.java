package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	private ArrayList<Messages> entrys;

	
	public ArrayList<Messages> getEntrys() {
		return entrys;
	}

	public void setEntrys(ArrayList<Messages> entrys) {
		this.entrys = entrys;
	}

	public void addPost(Messages entry) {
		this.entrys.add(entry);
	}
	
	public void removePost(Messages entry) {
		this.entrys.remove(entry);
	}

	public void printFeed() {
		for(Messages n : this.entrys) {
			System.out.println(n);
		}
	}
}
