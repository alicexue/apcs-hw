import.java.io.*;
import.java.util.*;

public class Search implements Comparable {
    private int[] = new int[100];

    public Search() {
	Random r = new Random();
	for (int i=0;i<a.length;i++) {
	    a[i]=i;
	}
    }

    public int lsearch(int q) {
	// returns null if can't find it
	for (int i=0;i<a.length;i++) {
	    if (a[i].compareTo(q)==0) {
		return q;
	    }
	}
	return null;
    }

    public int bsearch(int q) {
