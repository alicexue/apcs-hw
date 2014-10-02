public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }

    public String tri1(int h) {
	String s = "";
	int height = 0;
        while (height < h) {
	    int star = height + 1;
	    while (star > 0) {
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    height = height + 1;
      	}
	return s;
    }

    public String tri2 (int h) {
	String s = "";
	int star = 1;
	int height = h;
	while (height > 0) {
	    int row = star;
	    int space = h - star;
	    while (space > 0) {
		s = s + " ";
		space = space -1;
	    }
	    while (star > 0) {
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    star = row + 1;
	    height = height - 1;
	}
	return s;
    }
	   
}