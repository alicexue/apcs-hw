import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	int size = 20;
	int[] a = new int[size];
	Random r = new Random();

	for (int i=0;i<size;i++) {
	    al.add(i);
	    a[i]=i;
	}
    
	// randomize ArrayList al
	for (int i=0;i<size;i++) {
	    int oldval=al.get(i);
	    int replace=r.nextInt(al.size());
	    al.set(i,al.get(replace));
	    al.set(replace,oldval);
	}

	// randomize array a
	for (int i=0;i<size;i++) {
	    int oldval2=a[i];
	    int replace2=r.nextInt(a.length);
	    a[i]=a[replace2];
	    a[replace2]=oldval2;
	}

	String printa="";
	for (int i=0;i<a.length;i++) {
	    printa=printa+a[i]+", ";
	}
    
	System.out.println(al);
	System.out.println(printa);
    }
}
