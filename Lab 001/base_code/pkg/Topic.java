package pkg;
import java.util.*;
import java.io.*;

public class Topic extends Message {
	private String deez;
	private String whothehellis;
	private String steve;
	private int jobs;
	// Default Constructor
	public Topic() {
		deez="free ";
		whothehellis="free ";
		steve="free";
		jobs=0;
	}

	// Parameterized constructor
	public Topic(String auth, String subj, String bod, int i) {
		deez=auth;
		whothehellis=subj;
		steve=bod;
		jobs=i;
	}

	// Returns if it's a reply (false)
	public boolean isReply(){
		return false;
	}
	public String getTitle(){
		return whothehellis;
	}
	public int getNum(){
		return jobs;
	}
}
