public class Arrays {

    public int[] frontPiece(int[] nums) {
	int len = Math.min(2, nums.length);
	int[] newNums = new int[len];
	for (int i = 0; i < len; i++) {
	    newNums[i] = nums[i];
	}
	return newNums;
    }

    public int sum13(int[] nums) {
	int sum = 0;
	boolean last13 = false;
	for (int i = 0; i < nums.length; i++) {
	    if (last13 == false) {
		if (nums[i] != 13) {
		    sum += nums[i];
		} else {
		    last13 = true;
		}
	    } else if (nums[i] != 13) {
		last13 = false;
	    }	
	}
	return sum;
    }
    



    public static void main(String[] args) {
	System.out.println("Tested on CodingBat");
    }
}
	
	
