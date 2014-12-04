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
	System.out.println("Testing Errors:");
	a.add(20,"giving");
	a.get(20);
	a.set(34,"hi");
	a.remove(18);
    }
	

}
