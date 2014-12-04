public class orderedSuperArray extends Sarray {
    public void add (int index, String element) {
	String[] data=super.getData();
	if (index>data.length-1 || index<0) {
	    throw new ArrayIndexOutOfBoundsException(); 
	} 
	add(element);
	super.remove(index);
    }

    public boolean add (String element) {
	String[] data=super.getData();
	String smallS=data[0];
	int indexS = 0;
	String[] newarray=new String[data.length+1];
	for (int a=0;a<data.length;a++){
	    newarray[a]=data[a];
	    if (smallS.compareTo(data[a])<0) {
		String oldS = data[a];
		set(indexS,data[a]);
		set(a,smallS);
	    }
	}
	data=newarray;
	return true;
    }	   

    public String set (int index,String element) {
	String oldval=super.set(index,element) ;
	add(index,element);
	return oldval;
    }

    
    public static void main (String[] args) {
	orderedSuperArray a = new orderedSuperArray();
	System.out.println(a);
	a.add(5,"monday");
	System.out.println(a);
	a.add("week");
	System.out.println(a);
    }
}
    
