public class Driver {
    public static void main(String[] args) {
	arrays a = new arrays();
	System.out.println(a);
	System.out.println(a.find(100));
	System.out.println(a.maxVal());
	System.out.println(a.freq(1));
	
	codingbat b = new codingbat();
	int[] c = {1,2,2};
	System.out.println(b.sum67(c));
	int[] d = {1,4,1};
	System.out.println(b.more14(d));
	int[] e = {2,10,3,4,20,5};
	System.out.println(b.tenRun(e));
	int[] f = {1,4,5,6,2};
	System.out.println(b.tripleUp(f));
	int[] g = {1,1,1,2,1};
	System.out.println(b.canBalance(g));
	System.out.println(b.seriesUp(3));
    }
}