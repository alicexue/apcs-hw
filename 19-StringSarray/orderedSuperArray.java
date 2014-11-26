public class orderedSuperArray extends Sarray {
    public orderedSuperArray() {
	super();
    }
    
    public String order() {
	String smallS=data1[0];
	int indexS = 0;
	for (int i=0;i<data1.length;i++) {
	    if (smallS.compareTo(data1[i])<0) {
		String oldS = data1[i];
		set(indexS,data1[i]);
		set(i,smallS);
	    }
	}
	return data1;
    }

    public static void main (String[] args) {
	orderedSuperArray a = new orderedSuperArray();
	System.out.println(a.order());
    }
}
    
