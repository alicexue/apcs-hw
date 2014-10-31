public class codingbat {
       public int sum67(int[] nums) {
	   int sum=0;
	   boolean prev6 = false;
	   for (int i=0;i<nums.length;i++) {
	       int q = nums[i];
	       if (prev6==false) {
		   if (q==6) {
		       prev6=true;
		   } else {
		       sum+=q;
		   }
	       } else {
		   if (q==7) {
		       prev6=false;
		   }
	       }
	   }
	   return sum;
       }


    public boolean more14(int[] nums) {
	int one=0;
	int four=0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i]==1) {
		one+=1;
	    }
	    if (nums[i]==4) {
		four+=1;
	    }
	}
	return one>four;
    }

    public int[] tenRun(int[] nums) {
	int multiple=-1;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i]%10==0) {
		multiple=nums[i];
	    } else if (multiple!=-1) {
		nums[i]=multiple;
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	if (nums.length==0) {
	    return false;
	}
	int previous=nums[0];
	int count=1;
	for (int i=1;i<nums.length;i++) {
	    if (nums[i]-1==previous) {
		count+=1;
		if (count==3) return true;
	    } else {
		count=1;
	    }
	    previous=nums[i];
	}
	if (count==3) {
	    return true;
	}
	return false;  
    }
    public boolean canBalance(int[] nums) {
	int firstsum = 0;
	int lastsum = 0;
	for (int i =0; i < nums.length;i++){
	    firstsum+=nums[i];
	    for (int q=i+1;q<nums.length;q++){
		lastsum+=nums[q];
	    }
	    if (firstsum==lastsum){
		return true;
	    }
	    lastsum = 0;
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] newarray = new int[n*(n+1)/2];
	int count = 0;
	int num = 1;
	for (int i=0; i<newarray.length; i++) {
	    newarray[i]=num;
	    num+=1;
	    if (i==count){
		count+=num;
		num=1;
	    }
	}
	return newarray;
    }

    // doesn't work for all cases
    public int maxMirror(int[] nums) {
	int count=0;
	boolean exists=false;
	int firstpos=0;
	int lastpos=0;
	for (int i=0;i<nums.length;i++) {
	    for (int q=nums.length-1;q>=0;q--) {
		if (nums[i]==nums[q]) {
		    exists=true;
		    firstpos=i;
		    lastpos=q;
                    //count=1;
		    break;
		}
	    }
	    break;
	}
    
	if (exists==true) {
	    for (firstpos=firstpos+1;firstpos<nums.length;firstpos++) {
		if (nums[firstpos]==nums[lastpos-1]) {
		    count++;
		    lastpos--;
		}
            }
	}
	return count;

    }
}

