import java.util.*;
class longestconsecutivesequence {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;

        Arrays.sort(nums);
        int count=0;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i==0){
                count=1;
                if(n==1)
                    return count;
            }
            else if(nums[i]==nums[i-1]){
                if(i==n-1)
                    ans.add(count);
                else 
                    continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
                if(i==n-1)
                    ans.add(count);
            }
            else{
                ans.add(count);
                count=1;
            }    
        }

        Collections.sort(ans,Collections.reverseOrder());
        return ans.get(0);    
    }

    public static void main(String[] args){
        longestconsecutivesequence obj= new longestconsecutivesequence();

        //Example 1
        int[] nums1={100,4,200,1,3,2};
        int ans1=obj.longestConsecutive(nums1);
        System.out.println(ans1);

        //Example 2
        int[] nums2={0,3,7,2,5,8,4,6,0,1};
        int ans2=obj.longestConsecutive(nums2);
        System.out.println(ans2);

        //Example 3
        int[] nums3={0,0};
        int ans3=obj.longestConsecutive(nums3);
        System.out.println(ans3);

        
    }
}
