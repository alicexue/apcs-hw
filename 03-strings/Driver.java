public class Driver {
    public static void main(String[] args){
	String s="alice xue";
	String first = s.substring(0, s.indexOf(' '));
	String last = s.substring(s.indexOf(' ')+1);
    }
}