import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		SinglyLinkedList todd=new SinglyLinkedList();
		for(int i=9; i<20; i++){
			todd.insert(i,(int)Math.random()*100);
		}
		for(int b=0; b<20; b++){
			todd.insert((int)Math.random()*20, -1);
		}
		todd.printList();
		for(int t=0; t<40; t++){
			todd.swap(t,40-t);
		}
		todd.printList();
	}
}
