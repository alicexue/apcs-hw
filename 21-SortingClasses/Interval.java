import java.io.*;
import java.util.*;

public class Interval implements Comparable {

    private int low,high;
    private static Random r = new Random();
    // static gives us a random number from a sequence
    //the class makes the random number generator and whenever we use it, we get the next number in the sequence
    private static int numIntervals = 0;
    // use static to keep track of how many intervals we made
    
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    /*
    public int getHigh() {
        return high;
    }

    public int getLow() {
	return low;
    }
    */
    
    public Interval() {
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	//String s = "Interval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";

	return s;
    }
    
    /*
    public int compareTo(Interval other) {
	if (low == other.getLow()) {
	    return high-other.getHigh();
	}
	return low-other.getLow;
    }
    */
    
    public int compareTo(Object other) {
    // cast other to the appropriate type and store in a local variable for convenience
        Interval o = (Interval) other;
	if (this.low == o.low) {
	    return this.high-o.high;
	}
	return this.low-o.low; 
    }    


    public static void printstuff() {
	System.out.println("Stuff");
    }
    public static void main(String[] args) {

	Interval ival = new Interval();
	ival.printstuff(); // normal calling off of an instance
	printstuff(); // since printStuff is static we can call it without an instance
	Interval.printstuff(); // we can also call it right off a class

	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	Interval q = new Interval();
	System.out.println(ival.toString());
	System.out.println(q.toString());
	System.out.println(ival.compareTo(q));

	/*
	String[] sa = {"hello", "frog", "absolute", "zoo", "bagel"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
	*/

    } 
}
