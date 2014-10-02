public class Triangles {
    public String tri1(int h) {
	String s = new String();
	int height = 1;
	int row = h;
        while (row > 0) {
	    int star = height;
	    while (star > 0) {
		s = s + "*";
	    }
	    s = s + "\n";
	    height = height + 1;
	    row = row - 1;
      	}
	return s;
    }

    public String tri2 (int h) {
	String s = new String();
	int height = 1;
	int row = h;
	while (row > 0) {
	    int space = h - height;
	    int star = height;
	    while (space>0) {
		s = s + " ";
		space = space - 1;
	    }
	    while (star > 0) {
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    height = height + 1;
	    row = row - 1;
	}
	return s;
    }
	   
}