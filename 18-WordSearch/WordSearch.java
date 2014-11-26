/**
 * Creates a word search puzzle
 *
 */
import java.io.*;
import java.util.*;

public class WordSearch{

    private char[][] board;
    private Random rnd = new Random();
    
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

    public boolean checkbounds(String w, int r, int c, int addrow, int addcol) {
	boolean addword=true;
	try {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] != w.charAt(i) && board[r][c] != '.') {
		    addword=false;
		}
		r+=addrow;
		c+=addcol;
	    }
	} catch (Exception e) {
	    addword=false;
	}
	return addword;
    }

 
    public void addWordH(String w,int r, int c, boolean forward){
	boolean addword=true;
	if (forward) {
	    addword=checkbounds(w,r,c,0,1);
	} else {
	    addword=checkbounds(w,r,c,0,-1);
	}

	if (addword) {
	    for (int i=0;i<w.length();i++) {
		board[r][c] = w.charAt(i);
		if (forward) {
		    c++;
		} else {
		    c--;
		}
	    }
	} 
    }	   

    public void addWordV(String w, int r, int c, boolean forward) {
	boolean addword = true;
	if (forward) {
	    addword=checkbounds(w,r,c,1,0);
	} else {
	    addword=checkbounds(w,r,c,-1,0);
	}
	if (addword){
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] == w.charAt(i) || board[r][c] == '.') {
		    board[r][c] = w.charAt(i);
		}
		if (forward) {
		    r++;
		} else {
		    r--;
		}
	    }
	}
    }


    public void addWordD(String w, int r, int c, boolean forward) {
	boolean addword = true;
	if (forward) {
	    addword=checkbounds(w,r,c,-1,1);
	} else {
	    addword=checkbounds(w,r,c,-1,-1);
	}  
	if (addword) {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] == w.charAt(i) || board[r][c] == '.') {
		    board[r][c] = w.charAt(i);
		}
		if (forward) {
		    r--;
		    c++;
		} else {
		    r--;
		    c--;
		}
	    }
	}
    }

    public void addWordDbw(String w, int r, int c, boolean forward) {
	boolean addword = true;
	if (forward) {
	    addword=checkbounds(w,r,c,1,-1);
	} else {
	    addword=checkbounds(w,r,c,-1,-1);
	}  
	if (addword) {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] == w.charAt(i) || board[r][c] == '.') {
		    board[r][c] = w.charAt(i);
		}
		if (forward) {
		    r++;
		    c--;
		} else {
		    r--;
		    c--;
		}
	    }
	}
    }

    public boolean addWord(String w) {
	Random q = new Random();
	int a = q.nextInt(4);
	int r = q.nextInt(board.length);
	int c = q.nextInt(board[0].length);
	boolean forward = true;
	if (q.nextInt(2)==0) {
	    forward = false;
	}
	if (a==0) {
	    try {
		addWordH(w,r,c,forward);
	    } catch (Exception e) {
		return false;
	    }
	}
	if (a==1) {
	    try {
		addWordV(w,r,c,forward);
	    } catch (Exception e) {
		return false;
	    }
	}
	if (a==2) {
	    try {
		addWordD(w,r,c,forward);
	    } catch (Exception e) {
		return false;
	    }
	}
	if (a==3) {
	    try {
		addWordDbw(w,r,c,forward);
	    } catch (Exception e) {
		return false;
	    }
	}
	return true;
    }

    public void addLetters(){
	char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='.') {
		    board[r][c]=letters[rnd.nextInt(26)];
		}
	    }
	}
    }

    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	/*
	w.addWordH("hello",3,0,true);
	w.addWordH("look",3,7,true);
	w.addWordH("hello",100,500,true);
	w.addWordH("hello",5,555,true);
	w.addWordH("hello",7,555,false);
	w.addWordH("backwards",17,15,false);
	w.addWordV("hello",7,14,true);
	w.addWordV("hello",7,14,false);
	w.addWordD("hello",6,8,true);
	w.addWordDbw("hello",15,16,true);
	w.addWordD("hello",15,2,false);
	w.addWordDbw("hello",13,25,false);
	w.addWord("november");
	w.addWord("thanksgiving");
	w.addWord("turkeys");
	w.addWord("potatoes");
	*/

	try {
	    Scanner sc = new Scanner (new File ("words.txt"));
	    while (sc.hasNext()) {
		    String s = sc.next();
		    w.addWord(s);
		}
	} catch (Exception e) {
	    System.out.println("Can't open file");
	}


		
	w.addLetters();

	System.out.println(w);
    }
}
