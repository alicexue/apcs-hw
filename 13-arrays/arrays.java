public class arrays {
    //all working
    public int[] frontPiece(int[] nums) {
	int[] intarray;
	if (nums.length>=2) {
	    intarray = new int[2];
	    intarray[0] = nums[0];
	    intarray[1] = nums[1];
	    return intarray;
	} else {
	    return nums;
	}
    }
    public int sum13(int[] nums) {
	int sum = 0;
	int q = 0;
	for (int a=0;a<nums.length;a++){
	    if (nums[a]==13){
		q+=nums[a];
		if (a<nums.length-1&&nums.length>2) {
		    q+=nums[a+1];
		}
	    }
	    sum+=nums[a];
	}
	return sum - q;
     
    }
}