//all working. while and for loops included for all

public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row;
	int col;
	/*
	row = 0;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	*/
	for (row=0;row<r;row++) {
	    for (col=c;col>0;col--) {
		s = s + "*";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public String tri1(int h) {
	String s = "";
	int height = 0;
	int star;
	/*
        while (height < h) {
	    star = height + 1;
	    while (star > 0) {
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    height = height + 1;
      	}
	*/
	for (height=0;height<h;height++) {
	    for (star=height+1;star>0;star--) {
		s = s + "*";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public String tri2 (int h) {
	String s = "";
	int star = 1;
	int height = h;
	int row;
	int space;
	/*
	while (height > 0) {
	    row = star;
	    space = h - star;
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
	*/
	for (height=h;height>0;height--) {
	    row = star;
	    for (space=h-star;space>0;space--) {
		s = s + " ";
	    }
	    for (space=h-star;star>0;star--) {
		s = s + "*";
	    }
	    s = s + "\n";
	    star = row + 1;
	}
	return s;
    }

    public String tri3(int h) {
	int row = 0;
	int row2 = 1;
	String s = ""; 
	int spaces = 0;
	int stars;
	/*
	while (row<h) {
	    spaces = h - row - 1;
	    while (spaces>0) {
		s = s + " ";
		spaces = spaces - 1;
	    }
	    stars = 2 * (row2 - 1) + 1;
	    while (stars > 0) {
		s = s + "*";
		stars = stars -1;
	    }
	    row = row + 1;
	    row2 = row2 + 1;
	    s = s + "\n";
	}
	*/
	for (row=0;row<h;row++) {
	    for (spaces=h-row-1;spaces>0;spaces--) {
		s = s + " ";
	    }
	    for (stars=2*(row2-1)+1;stars>0;stars--) {
		s = s + "*";
	    }
	    row2 = row2 + 1;
	    s = s + "\n";
	}
	return s;
    }

    public String diamond (int h) {
	String s = "";
	int row = 1;
	int height = h;
	int space;
	int stars;
	/*
	while (row<=h) {
	    if (row <= h/2) {
		space = (height-1)/2;
	    } else if (row == h/2 + 1) {
		space = 0;
	    } else {
		space = (row-1)/2;
	    }
	    while (space>0) {
		s = s + " ";
		space = space - 1;
	    }
	    if (row <= h/2) {
		stars = (2 * (row - 1) + 1);
		while (stars > 0) {
		    s = s + "*";
		    stars = stars - 1;
		}
	    } else {
		stars = (2 * Math.abs(row - h) + 1);
		while (stars > 0) {
		    s = s + "*";
		    stars = stars - 1;
		}
	    }
	    height = height - 1;
	    row = row + 1;
	    s = s + "\n";
	}
	*/
	for (row=1;row<=h;row++) {
	    if (row <= h/2) {
		space = (height-1)/2;
	    } else if (row == h/2 + 1) {
		space = 0;
	    } else {
		space = (row-1)/2;
	    }
	    for (space=space;space>0;space--) {
		s = s + " ";
	    }
	    if (row <= h/2) {
		for (stars=2*(row-1)+1;stars>0;stars--) {
		    s = s + "*";
		}
	    } else {
		for (stars=2*Math.abs(row-h)+1;stars>0;stars--) {
		    s = s + "*";
		}
	    }
	    height = height - 1;
	    s = s + "\n";
	}
	return s;
    }

    public String tri4(int h) {
	String s = "";
	int height = 0;
	int space;
	int star;
	/*
        while (height <= h) {
	    space = height + 1;
	    while (space > 0) {
		s = s + " ";
		space = space - 1;
	    }
	    star = h - height- 1;
	    while (star >= 0) {
		s = s + "*";
		star = star - 1;
	    }
	    s = s + "\n";
	    height = height + 1;
      	}
	*/
	for (height=0;height<=h;height++) {
	    for (space=height+1;space>0;space--) {
		s = s + " ";
	    }
	    for (star=h-height-1;star>=0;star--) {
		s = s + "*";
	    }
	    s = s + "\n";
	}
	return s;
    }

	
}
