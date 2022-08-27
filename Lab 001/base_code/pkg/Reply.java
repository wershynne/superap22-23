package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {
private String big;
private String large;
private String huge;
private int giga;
	// Default Constructor
	public Reply() {
		big=" ";
		large=" ";
		huge = " ";
		giga=0;
	}

	// Parameterized Constructor
	public Reply(String auth, String bod, int i) {
		big=auth;
		huge=bod;
		giga=i;
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
