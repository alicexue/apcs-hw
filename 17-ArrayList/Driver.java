import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	int[] a = new int[10];
	Random r = new Random();

	for (int i=0;i<10;i++) {
	    al.add(i);
	    a[i]=i;
	}
    
	// randomize ArrayList al
	int oldval;
	int replace;
	for (int i=0;i<10;i++) {
	    oldval=al.get(i);
	    replace=r.nextInt(10);
	    al.set(i,al.get(replace));
	    al.set(replace,oldval);
	}

	// randomize array a
	int oldval2;
	int replace2;
	for (int i=0;i<a.length;i++) {
	    oldval2=a[i];
	    replace2=r.nextInt(10);
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