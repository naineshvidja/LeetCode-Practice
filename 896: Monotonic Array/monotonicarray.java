public class monotonicarray {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        
        if(n==0 || n==1)
            return true;
        else if(nums[0]==nums[1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]==nums[i])
                    continue;
                else if(nums[i-1]<=nums[i]){
                    for(int j=i;j<n;j++){
                        if(nums[j-1]<=nums[j]){
                            continue;
                        }
                        else
                            return false;
                    }
                    break;
                }
                else if(nums[i-1]>=nums[i]){
                    for(int j=i;j<n;j++){
                        if(nums[j-1]>=nums[j]){
                            continue;
                        }
                        else
                            return false;
                    }
                    break;
                }      
            }
        }
        else if(nums[0]<=nums[1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]<=nums[i]){
                    continue;
                }
                else
                    return false;
            }
        }
        else if(nums[0]>=nums[1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]>=nums[i]){
                    continue;
                }
                else
                    return false;
            }
        }
        else
            return false;
        
        return true;
    }
    public static void main(String[] args){
        monotonicarray obj= new monotonicarray();
        
        //Example 1
        int[] nums1 = {1,2,2,3};
        Boolean b1= obj.isMonotonic(nums1);
        System.out.println(b1);

        //Example 2
        int[] nums2 = {1,1,0};
        Boolean b2= obj.isMonotonic(nums2);
        System.out.println(b2);

        //Example 3
        int[] nums3 = {9};
        Boolean b3= obj.isMonotonic(nums3);
        System.out.println(b3);
    }
}
