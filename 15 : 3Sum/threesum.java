import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];

                if(sum==0){
                    List<Integer> res=new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    ans.add(res);

                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum<0)
                    j++;

                else
                    k--;

            }
        }
        return ans;
    }
    public static void main(String[] args){
        threesumbrute obj= new threesumbrute();

        //Example 1
        int[] nums1 = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans1 = obj.threeSum(nums1);
        System.out.println(ans1);

        //Example 2
        int[] nums2 = {0,1,1};
        List<List<Integer>> ans2 = obj.threeSum(nums2);
        System.out.println(ans2);

        //Example 3
        int[] nums3 = {0,0,0};
        List<List<Integer>> ans3 = obj.threeSum(nums3);
        System.out.println(ans3);
    }

}
