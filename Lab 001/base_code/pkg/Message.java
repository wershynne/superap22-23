package pkg;
import java.util.*;
import java.io.*;

public class Message{
private String au;
private String subject;
private String body;
private int number;
private ArrayList<Message> deez=new ArrayList<>();//ligma
	// Default Constructor
	public Message() {
		au=" ";
		subject=" ";
		body=" ";
		number=0;
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		au=auth;
		subject=subj;
		body=bod;
		number=i;
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its deez, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 
	public void print(int indentation, Message title){
		if(indentation == 0) {
			System.out.println("\n------------------------------------------------------");
		}
		for(int i=0; i<indentation; i++){
			System.out.print("  ");
		}
		System.out.print("Message #"+number+":");
		for(int i=0; i<indentation; i++){
			System.out.print("Re:");
		}
		System.out.println("\""+subject+"\"");
		for(int i=0; i<indentation; i++){
			System.out.print("  ");
		}
		System.out.print("From"+au+": "+"\""+body+"\"");
		for(int i=0; i<deez.size(); i++){
			deez.get(i).print(indentation+1, title);
		}
		if(indentation==0){
			System.out.println("\n----------------------------------------------------------");
		}
		System.out.print("Print works");
	}
	public void indent(int indentation){
		for(int e=0; e<indentation;e++){
			System.out.print("  ");
		}
	}

	// Default function for inheritance
	public boolean isReply(){
		return false;
	}

	// Returns the subject String
	public String getSubject(){
		return subject;
	} 
	public String getTitle(){
		return " ";
	}

	// Returns the ID
	public int getId(){
		return number;
	}

	// Adds a child pointer to the parent's deez.
	public void addChild(Message child){
		deez.add(child);	
	}

}
