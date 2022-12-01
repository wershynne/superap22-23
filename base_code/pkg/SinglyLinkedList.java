package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {
		head=null;
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		Node f = head;
		for(int i=0;i<pos-1;i++){
			f=f.getNext();
			if(f==null){
				return -1;
			}
		}
			return f.getData();
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos int data){
		Node temp = new Node(data);
		Node g = head;
		for(int i=0; i<pos-2; i++){
			g=g.getNext();
		}
		g.setNext(temp);   
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
	Note p=head;
		for(int i=0; i<pos-1; i++){
			p=p.getNext();
		}
		while(get(pos)>-1){
			p.setNext((p.getNext()).getNext());
		}
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){
		if(get(pos1)>-1&&get(pos2)>-1){
		Node t=new Node(get(pos2));
		Node k = new Node(get(pos1));
			Node p=head;
			for(int i=0; i<pos1-2; i++){
				p=p.getNext();
			}
			p.setNext(t);
			p=head;
			for(int l=0; l<pos2-2; l++){
				p=p.getNext();
			}
			p.setNext(k);
		}
		else{
				System.out.println("Clown. Actual buffoon. At least one of those isn't in the list of nodes YOU created.");
		}
	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
	int g=0;
	while(get(g)>-1){
		System.out.print(get(g)+" ");
		g++;
	}
	}
}
