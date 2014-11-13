import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random q = new Random();
	for (int i=0;i<20; i++) {
	    al.add(q.nextInt(5)+1);
	}
	System.out.println(al);
	ArrayList<Integer> delete = new ArrayList<Integer>();
	int prev=al.get(19);
	for (int i=19;i>0;i--) {
	    if (al.get(i-1)==prev) {
		al.remove(i-1);
	    }
	    prev=al.get(i-1);
	}
	System.out.println(al);
    }
}
	
	
