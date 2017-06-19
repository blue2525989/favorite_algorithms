package main;

public class FindMiddleIndex {
	
	public static int findMiddleIndex(int[] nums) throws Exception {
		int endIdx = nums.length -1;
		int startIdx = 0;
		int sumL = 0;
		int sumR = 0;
		while (true) {
			if (sumL > sumR) {
				sumR += nums[endIdx--];
			} else {
				sumL += nums[startIdx++];
			}
			if (startIdx > endIdx) {
				if (sumL == sumR) {
					break;
				} else {
					throw new Exception("Please enter correct array type");
				}
			}
		}
		
		return endIdx;
	}
	
	public static void main(String[] args) {
		
		int[] num = { 2, 4, 4, 5, 4, 1,  2, 4, 4, 5, 4, 1, 2, 4, 4, 5, 4, 1, 4};
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                            + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	}
}