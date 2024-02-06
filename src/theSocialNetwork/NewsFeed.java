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

    public Messages searchUserEntry(String username) {
        for (Messages entry : this.entrys) {
            if (entry.getAuthor().equals(username)) {
                return entry;
            }
        }
        return null; // User not found
    }
	
}
