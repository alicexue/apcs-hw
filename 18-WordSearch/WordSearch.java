/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}	
    }

    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public int checkrow(int row) {
	if (row>=20) {
	    row = 19;
	}
	return row;
    }

    public int checkcol(String w, int col) {
	if (col>=30-w.length()) {
	    col = 30-w.length();
	}
	return col;
    }

    public void checkbounds(String w, int r, int c, int o) {
	if (r==o) {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] != w.charAt(i) && board[r][c] != '.') {
		    throw new ArrayIndexOutOfBoundsException();
		}
		r++;
	    }
	} else {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] != w.charAt(i) && board[r][c] != '.') {
		    throw new ArrayIndexOutOfBoundsException();
		}
		c++;
	    }
	}
    }
	

    public void addWordH(String w,int row, int col){
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,c);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }	   

    public void addWordHbw(String w,int row, int col){
	int r = checkrow(row);
	int c = checkcol(w,col);
	
	checkbounds(w,r,c,c);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c--;
	}
    }

    public void addWordV(String w, int row, int col) {
	int r = checkrow(row);
	int c = checkcol(w,col);
	
	checkbounds(w,r,c,r);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    r++;
	}
    }

    public void addWordVbw(String w, int row, int col) {
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,r);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    r--;
	}
    }


    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH("hello",3,0);
	w.addWordH("look",3,7);
	w.addWordH("hello",100,500);
	w.addWordH("hello",5,555);
	w.addWordHbw("hello",7,555);
	w.addWordHbw("backwards",17,15);
	w.addWordV("hello",7,14);
	w.addWordVbw("hello",7,14);
	System.out.println(w);
	}
}