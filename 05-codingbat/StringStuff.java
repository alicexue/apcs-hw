public class StringStuff {

    // homework from 9/23, all working

    // nonStart
    public String nonStart(String a, String b) {
	return (a.substring(1)+b.substring(1));
    }

    // makeABBA
    public String makeAbba(String a, String b) {
	return (a+b+b+a);
    }

    // diff21
    public int diff21(int n) {
	if (n<=21) {
	    return 21-n;
	} else {
	    return (n-21)*2;
	}
    }

    // classwork is in Henry's repository
}
