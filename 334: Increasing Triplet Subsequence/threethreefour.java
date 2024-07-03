public class threethreefour {
    public boolean increasingTriplet(int[] nums) {
        int p,q;
        for(int i=0;i<nums.length-2;i++){
            for(p=i+1;p<nums.length-1;p++){
                if(nums[p]>nums[i]){
                    for(q=p+1;q<nums.length;q++){
                        if(nums[q]>nums[p])
                            return true;
                    }  
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        threethreefour obj= new threethreefour();

        //Example 1
        int[] nums1={1,2,3,4,5};
        boolean ans1= obj.increasingTriplet(nums1);
        System.out.println(ans1);

        //Example 1
        int[] nums2={20,100,10,12,5,13};
        boolean ans2= obj.increasingTriplet(nums2);
        System.out.println(ans2);

        //Example 1
        int[] nums3={2,4,-2,-3};
        boolean ans3= obj.increasingTriplet(nums3);
        System.out.println(ans3);
    }
}
