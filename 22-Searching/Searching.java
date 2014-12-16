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
	a=b;
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
	int mid = a.length/2;
	int count = a.length/2;
	int low;
	while (count>0) {
	    if (a[mid].compareTo(item)<0) {
		low = 0;
	    } else {
		low = mid;
	    }
	    for (int i=low;i<a.length;i++) {
		if (a[i].compareTo(item)==0) {
		    return item;
		}
	    }
	count++;
	}
	return null;
    }

    public Comparable rbsearch(Comparable item, int low, int high) {
	int mid = (low+high)/2;
	if (item.compareTo(a[mid])==0) {
	    return item;
	} else if (item.compareTo(a[high])>0) {
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
	return rbsearch(item,0,a.length-1);
    }

    public static void main (String[] args) {
	Searching a = new Searching(10);
	Random rnd = new Random();
	for (int i=0;i<10;i++) {
	    a.additem(rnd.nextInt(100));
	}
	a.additem(23);
	a.sort();
	System.out.println(a.toString());
	System.out.println(a.lsearch(23));
	System.out.println(a.bsearch(23));
	System.out.println(a.rbsearch(23));
	
    }
	  
}  