public class While {

    // frontTimes: 3 minutes
    public String frontTimes(String str, int n) {
	String result = "";
	if (str.length()<3) {
	    int x = 0;
	    while (x<n) {
		result = result + str;
		x = x + 1;
	    }
	} else {
	    int x = 0 ;
	    while (x<n) {
		result = result + str.substring(0,3);
		x = x + 1;
	    }
	}      
	return result;
    }

    // stringBits: 3 minutes
    public String stringBits(String str) {
	int x = 0;
	String result = "";
	while (x<str.length()) {
	    if (x%2==0) {
		result = result + str.substring(x,x+1);
	    }
	    x = x + 1;
	}
	return result;
    }

    // stringYak: 5 minutes
    public String stringYak(String str) {
	String result = "";
	int x = 0;
	while (x<str.length()) {
	    if (x+2<str.length() && str.charAt(x)=='y' && str.charAt(x+1)=='a' && str.charAt(x+2)=='k') {
		x = x + 3;
	    } else {
		result = result + str.charAt(x);
		x = x + 1;
	    }
	}
	return result;
    }

    // stringMatch: 8 minutes
    public int stringMatch(String a, String b) {
	int x = 0;
	int count = 0;
	String shorter = a;
	String longer = b;
	if (a.length()>b.length()) {
	    shorter = b;
	    longer = a;
	}  
	while (x<=shorter.length()-2) {
	    if (shorter.substring(x, x+2).equals(longer.substring(x, x+2))) { 
		count = count + 1;
	    }
	    x = x + 1;
	}
	return count;
    }
}