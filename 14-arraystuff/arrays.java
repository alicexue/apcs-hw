import java.util.*;

public class arrays {
    private int[] a;
    private Random rnd;
    
    public arrays(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i]=75+rnd.nextInt(76);
	}
    }

    public arrays(){
	this(100);
    }
    
    public String toString(){
	String s = "";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }


    public int find (int value){ //return index of 1st occurence of value
	int num = -1;
	for (int i=0;i<a.length;i++) {
	    if (a[i]==value){
		num = i;
		break;
	    }
	}
	return num;
    }


    public int maxVal(){ // largest value
	int max=a[0];
	for (int i=0;i<a.length;i++) {
	    if (a[i]>max) {
		max=a[i];
	    }
	}
	return max;
    }
	   
    public int freq(int i) {
	int count=0;
	for (int q=0;q<a.length;q++) {
	    if (a[q]==i) {
		count+=1;
	    }
	}
	return count;
    }

    //private int[] A;


    public int mode(int[] A) {
	int count=0;
	for (int i=0;i<A.length;i++) {
	    if (freq(A[i])>count) {
		count = freq(A[i]);
	    }
	}
	return count;
    }
}
