public class PE13_8 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,30,4,1,7,8,10};
        
        System.out.println("The largest number in the array is: " + findLarge(nums));
        
    }
    
    public static int findLarge(int[] nums) {
        return findLarge(nums, nums[0], 0);
    }   
    
    public static int findLarge(int[] nums, int num, int count) {
        if(nums.length <= count) {
            return num;
        }
        if(nums[count] > num) {
            num = nums[count];
        }
        count++;
        return findLarge(nums, num, count);
    }
}