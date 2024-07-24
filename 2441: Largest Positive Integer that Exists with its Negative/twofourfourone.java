import java.util.Arrays;

public class twofourfourone {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length - 1;
        int ans=-1;

        while(i<j){
            if(nums[i]+nums[j]==0){
                ans=nums[j];
                break;
            }
            else if(nums[i]+nums[j] > 0){
                j--;
            }
            else if(nums[i]+nums[j] < 0){
                i++;
            }     
        }
        return ans;
    }

    public static void main(String[] args){
        twofourfourone obj= new twofourfourone();

        //Example 1
        int[] nums1={-1,2,-3,3};
        int ans1= obj.findMaxK(nums1);
        System.out.println(ans1);

        //Example 2
        int[] nums2={-1,10,6,7,-7,1};
        int ans2= obj.findMaxK(nums2);
        System.out.println(ans2);
        
        //Example 3
        int[] nums3={-10,8,6,7,-2,-3};
        int ans3= obj.findMaxK(nums3);
        System.out.println(ans3);
    }
}
