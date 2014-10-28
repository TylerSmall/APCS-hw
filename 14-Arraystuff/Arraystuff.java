public class Arraystuff {

    public int sum67(int[] nums) {
	int sum = 0;
	boolean last6 = false;
	for (int i=0; i<nums.length; i++) {
	    if (last6 == true) {
		if (nums[i] == 7) {
		    last6 = false;
		}
	    } else {
		if (nums[i] == 6) {
		    last6 = true;
		} else {
		    sum += nums[i];
		}
	    }
	}
	return sum;
    }
		       
	        
