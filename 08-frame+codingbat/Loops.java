public class Loops {
    public String line (int r, int c) {
	String s = "";
	int stars;
	for (stars=c;stars>0;stars--) {
	    s = s + "*";
	}
	return s;
    }
    public String frame(int r,int c) {
	String s = line(r,c) + "\n";
	int row;
	int spaces;
	for (row=0;row<r-2;row++) {
	    s = s + "*";
	    for (spaces=0;spaces<c-2;spaces++) {
		s = s + " ";
	    }
	    s = s + "*\n";
	}
	s = s + line(r,c);
	return s;
    }

    public String stringSplosion(String str) {
	String s = "";
	int letter;
	for (letter=0;letter<str.length()-1;letter++) {
	    s = s + str.substring(0,letter+1);
	}
	s = s + str;
	return s;
    }

    public String stringX(String str) {
	String str2 = str;
	String s = "";
	int letter;
	if (str.length()>0 && str.substring(0,1).equals("x")) {
	    s = s + "x";
	}
	for (letter=0;letter<str.length();letter++) {
	    if (letter<str.length()-1 && !(str.substring(letter,letter+1).equals("x"))) {
		s = s + str.substring(letter,letter+1);
	    }
	}
	if (str.length()>1) {
	    s = s + str.substring(str.length()-1);
	}
	return s;
    }
}
	    