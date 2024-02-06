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
        return null;
    }

    public Messages findPost(String postType, String searchData) {
        for (Messages entry : this.entrys) {
            if (entry instanceof PhotoPost && postType.equals("PhotoPost")) {
                PhotoPost photoPost = (PhotoPost) entry;
                if (photoPost.getDataname().equalsIgnoreCase(searchData)) {
                    return photoPost;
                }
            } else if (entry instanceof MessagePosts && postType.equals("MessagePost")) {
                MessagePosts messagePost = (MessagePosts) entry;
                if (messagePost.getText().equalsIgnoreCase(searchData)) {
                    return messagePost;
                }
            }
        }
        return null; // Return null if no matching post is found
    }
	
}
