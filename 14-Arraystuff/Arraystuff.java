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

    public boolean more14(int[] nums) {
	int count1 = 0;
	int count4 = 0;
	for (int i=0; i<nums.length; i++) {
	    if (nums[i] = 1) {
		count1 += 1;
	    } else if (nums[i] = 4) {
		count4 += 1;
	    }
	}
	if (count1 > count4) {
	    return true;
	}
    }
	    
		       
	        
