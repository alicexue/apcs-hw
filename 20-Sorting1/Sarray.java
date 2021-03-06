import java.util.*;
import java.io.*;

public class Sarray{
    private String[] data; // should be object[]
    private int last; // location of last item

    public Sarray() {
	// start array at size 10, don't use 0
	data = new String[10];
	for (int w=0;w<data.length;w++) {
	    data[w]="q";
	}
	last=data.length-1;
    }

    public String[] getData() {
	return data;
    }

    
    public void showerror() {
	throw new ArrayIndexOutOfBoundsException();
    }

    public boolean add (String s) {
	// add to end
	String[] newarray=new String[data.length+1];
	for (int a=0;a<data.length;a++){
	    newarray[a]=data[a];
	}
	newarray[data.length]=s;
	data=newarray;
	last++;
	return true;
    }	   

    public void add (int index, String s) {
	// inserts at location index - shift everything else down
	if (index>data.length-1) {
	    showerror();
	} 
	String[] newarray=new String[data.length+1];
	for (int a=0;a<newarray.length;a++) {
	    if (a<index) {
		newarray[a]=data[a];
	    }
	    if (a==index) {
		newarray[a]=s;
	    }
	    if (a>index) {
		newarray[a]=data[a-1];
	    }
	}
        data = newarray;
        last++;
    }

    public int size(){
	return last;
    }

    public String get (int index) {
	// gets the item
	if (index>data.length-1) {
	    showerror();
	}
	return data[index];
    }
    
    public String set (int index, String s) {
	// replaces item
	if (index>data.length-1) {
	    showerror();
	} 
	String oldval=data[index];
	data[index]=s;
	return oldval;
    }
    
    public String remove (int index) {
	// must shift things over
	if (index>data.length-1) {
	    showerror();
	} 
        String oldval=data[index];
	for (int a=0;a<data.length-1;a++) {
	    if (a>=index) {
		data[a]=data[a+1];
	    }
	}
	data[data.length-1]="";
	last--;
	return oldval;
    }

    public void isort() {
	int q;
	int index;
	String newvalue;
	for (q=0;q<size()+1;q++) {
	    newvalue = data[q];
	    for (index=q;index>0&&newvalue.compareTo(data[index-1])<=0;index--) {
		data[index]=data[index-1];
	    }
	    data[index]=newvalue;
	}
    }
    


    public void ssort() {
	String min, replace1, replace2;
	int i;
	int pos;
	for (i=0;i<size();i++) {
	    pos = size() - 1;
	    min = data[i];
	    for (int q=i;q<size()+1;q++) {
		if (data[q].compareTo(min)<0) {
		    min=data[q];
		    pos=q;
		}
	    }
	    replace1 = data[i];
	    replace2 = min;
	    data[pos] = replace1;
	    data[i] = replace2;
	}
    }

    public void bsort() {
	String replace1, replace2;
	int newlength=data.length;
	String[] temp;
	for (int i=0;i<size()-1;i++) {
	    for (int q=0;q<size();q++) {
		if (data[q].compareTo(data[q + 1])>0) {
		    replace1 = data[q];
		    replace2 = data[q+1];
		    data[q] = replace2;
		    data[q+1] = replace1;
		}
	    }
	}
    }
	    

    public void builtin() {
	Arrays.sort(data);
    }

    public String toString() {
	String q = "";
	for (int i=0;i<data.length;i++) {
	    q=q+data[i]+", ";
	}
	return q;
    }

    public static void main (String[] args) {
	Sarray a = new Sarray();
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.add("hello"));
	System.out.println(a);
 	a.add(3,"hello");
        System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(4));
	System.out.println(a);
	System.out.println(a.set(4,"thanks"));
	System.out.println(a);
	System.out.println(a.remove(3));
	System.out.println(a);
	System.out.println(a.size());
	//a.isort();
	//System.out.println(a);
	//a.ssort();
	//System.out.println(a);
	//a.bsort();
	a.builtin();
	System.out.println(a);
	/*
	System.out.println("Testing Errors:");
	a.add(20,"giving");
	a.get(20);
	a.set(34,"hi");
	a.remove(18);
	*/
    }
	

}
