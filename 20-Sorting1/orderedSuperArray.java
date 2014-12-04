public class orderedSuperArray extends Sarray {

    public boolean add (String element) {
	String[] data = super.getData();
	if (size()==0) {
	    super.add(element);
	} else if (element.compareTo(get(size()-1))>0) {
	    super.add(element);
	} else {
	    for (int a=0;a<size();a++){
		if (element.compareTo(get(a))<0) {
		    add(a,element);
		    break;
		}
	    }
	}
	return true;
    }	   

    public String set (int index,String element) {
	String oldval=set(index,element);
	remove(index);
	add(element);
	return oldval;
    }

    
    public static void main (String[] args) {
	orderedSuperArray a = new orderedSuperArray();
	System.out.println(a);
	a.add("monday");
	a.add("week");
	a.add("tuesday");
	a.add("hi");
	a.add("12");
	a.set(4,"500");
	System.out.println(a);
    }
}
    
