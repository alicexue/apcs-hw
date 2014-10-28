import java.util.*;

public class arrays {
    private int[] a;
    public final int final_example = 123;
    //final is for a variable that should be constant
    //can't change the value after the initial assignment
    
    //constructor
    /*
    public arrays() {
	a=new int[100];
    }
    */
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
	//"" puts it in string context
	//the next part is invalid since the var is final
	//final_example = 321;
	//s = s + final_example;
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    /*
    public static void main(String[] args) {
	arrays a = new arrays();
	System.out.println(a);
    }
    */

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
	   
}
