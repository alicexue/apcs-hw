public class Sarray{
    private int[] data; // should be object[]
    private int last;

    public Sarray() {
	// start array at size 10, don't use 0
	data = new int[10];
	for (int w=0;w<data.length;w++) {
	    data[w]=9;
	}
	last=0;
    }
    public boolean add (int i) {
	// add to end
	int[] newarray=new int[data.length+1];
	for (int a=0;a<data.length;a++){
	    newarray[a]=data[a];
	}
	newarray[data.length]=i;
	data=newarray;
	return true;
    }	   

    public void add (int index, int i) {
	// inserts at location index - shift everything else down
	int[] newarray=new int[data.length+1];
	for (int a=0;a<data.length;a++) {
	    if (a<index) {
		newarray[a]=data[a];
	    }
	    if (a==index) {
		newarray[a]=i;
	    }
	    if (a>index) {
		newarray[a]=data[a-1];
	    }
	}
	data = newarray;
    }

    public int size(){
	int count=0;
        for (int a=0;a<data.length;a++) {
	    if (data[a]!=0) {
		count++;
	    } 
	}
	return count;
    }

    public int get (int index) {
	// gets the item
	return data[index];
    }
    
    public int set (int index, int i) {
	// replaces item
	int oldval=data[index];
	data[index]=i;
	return oldval;
    }
    
    public int remove (int index) {
	// must shift things over
	int oldval=data[index];
	for (int a=0;a<data.length-1;a++) {
	    if (a>=index) {
		data[a]=data[a+1];
	    }
	}
	data[data.length-1]=0;
	return oldval;
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
	System.out.println(a.add(5));
	System.out.println(a);
	a.add(3,7);
        System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(5));
	System.out.println(a);
	System.out.println(a.set(4,6));
	System.out.println(a);
	System.out.println(a.remove(3));
	System.out.println(a);
    }
	

}