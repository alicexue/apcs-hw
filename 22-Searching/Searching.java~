import java.io.*;
import java.util.*;

public class Searching {
    private Comparable[] a;
    private Random r = new Random();

    public Searching (int num) {
	a = new Comparable[num];
	for (int i=0;i<a.length;i++) {
	    a[i]=i;
	}
    }

    public String toString() {
	String result = "[";
	for (int i=0;i<a.length;i++) {
	    result=result+a[i]+",";
	}
	return result+"]";
    }
    
    public void additem(Comparable item) {
	Comparable[] b = new Comparable[a.length+1];
	for (int i=0;i<a.length;i++) {
	    b[i]=a[i];
	}
	b[b.length-1]=item;
    }

    public void sort() {
	Arrays.sort(a);
    }

    public Comparable lsearch(Comparable item) {
	// returns null if can't find it
	for (int i=0;i<a.length;i++) {
	    if (a[i].compareTo(item)==0) {
		return item;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item) {
	sort();
	if (a[a.length/2].compareTo(item)<0) {
	    for (int i=0;i<a.length;i++) {
		if (a[i].compareTo(item)==0) {
		    return item;
		}
	    }
	} else {
	    for (int i=a.length;i<a.length;i++) {
		if (a[i].compareTo(item)==0) {
		    return item;
		}
	    }
	}
	return null;
    }

    public Comparable rbsearch(Comparable item, int low, int high) {
	int mid = (low+high)/2;
	if (a[mid].compareTo(high)>0) {
	    return null;
	} else {
	    if (a[mid].compareTo(item)>0) {
		return rbsearch(item,0,mid);
	    } else {
		return rbsearch(item,mid,high);
	    }
	}
    }	    

    public Comparable rbsearch(Comparable item) {
	sort();
	return rbsearch(item,0,a.length);
    }

    public static void main (String[] args) {
	Searching a = new Searching(10);
	Random rnd = new Random();
	for (int i=0;i<10;i++) {
	    a.additem(rnd.nextInt(100));
	}
	a.sort();
	a.additem(23);
	System.out.print(a.lsearch(32));
	System.out.println(a.bsearch(23));
	System.out.println(a.rbsearch(2));
	
    }
	  
}  