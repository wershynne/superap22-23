import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class main {
	public static void main(String args[]) {
		String test = new String("8 3 2 - 2 + 9 * 27 - +");
		System.out.println("the end value is " + stacker(test));
	}
	public static int stacker(String inp){
		String[]place = inp.split(" ",10000);
		ArrayList<String> stack = new ArrayList<>(Arrays.asList(place));
		ArrayList<Integer> temp = new ArrayList<>();
		//temp arraylist to store previous nums
		int i=0;
		int big=stack.size();
		boolean wedonehere = false;
		while(i<big-1){
			if(stack.size()<4){
					i=2000;
					break;
			}
			boolean isnum=true;
			if((stack.get(i)).equals("*")){
				isnum=false;
				Integer inst = temp.get(temp.size()-2)*temp.get(temp.size()-1);
				String trans = String.valueOf(inst);
				stack.set(i-2, trans);
				stack.remove(i-1);
				stack.remove(i-1);
				temp.set(temp.size()-1, inst);
				temp.remove(temp.size()-2);
				big--;		
				String listString = String.join(" ",stack);
				stacker(listString);
			}
			else if((stack.get(i)).equals("+")){
				isnum=false;
				Integer inst1 = temp.get(temp.size()-2)+temp.get(temp.size()-1);
				String trans1 = String.valueOf(inst1);
				stack.set(i-2, trans1);
				stack.remove(i-1);
				stack.remove(i-1);
				temp.set(temp.size()-1, inst1);
				temp.remove(temp.size()-2);
				big--;
				String listString = String.join(" ",stack);
				stacker(listString);
			}
			else if((stack.get(i)).equals("-")){
				isnum=false;
				Integer inst2 = temp.get(temp.size()-2)-temp.get(temp.size()-1);
				String trans2 = String.valueOf(inst2);
				stack.set(i-2, trans2);
				stack.remove(i-1);
				stack.remove(i-1);
				temp.set(temp.size()-1, inst2);
				temp.remove(temp.size()-2);
				big--;
				String listString = String.join(" ",stack);
				stacker(listString);
			}
			else if((stack.get(i)).equals("/")){
				isnum=false;
				Integer inst3 = temp.get(temp.size()-2)/temp.get(temp.size()-1);
				String trans3 = String.valueOf(inst3);
				stack.set(i-2, trans3);
				stack.remove(i-1);
				stack.remove(i-1);
				temp.set(temp.size()-1, inst3);
				temp.remove(temp.size()-2);
				big--;
				String listString = String.join(" ",stack);
				stacker(listString);
			}
			else if((stack.get(i)).equals("%")){
				isnum=false;
				Integer inst4 = temp.get(temp.size()-2)%temp.get(temp.size()-1);
				String trans4 = String.valueOf(inst4);
				stack.set(i-2, trans4);
				stack.remove(i-1);
				stack.remove(i-1);
				temp.set(temp.size()-1, inst4);
				temp.remove(temp.size()-2);
				big--;
				String listString = String.join(" ",stack);
				stacker(listString);
			}
			if(isnum){
				temp.add(Integer.valueOf((stack.get(i))));
			}
			i++;
		}
		return (Integer.valueOf((stack.get(0))).intValue());
}
}