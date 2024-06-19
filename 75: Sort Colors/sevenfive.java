public class sevenfive {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<zero)
                nums[i]=0;
            else if(i>=zero && i<zero+one)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
    public static void main(String[] args){
        sevenfive obj= new sevenfive();

        //Example 1
        int[] nums1 = {2,0,2,1,1,0};
        obj.sortColors(nums1);
        System.out.print("[");
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+", ");
        }
        System.out.println("]");

        //Example 2
        int[] nums2 = {2,0,2,1,1,0,2,0,1,2,0,1,2,0,1,2,0,1};
        obj.sortColors(nums2);
        System.out.print("[");
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+", ");
        }
        System.out.println("]");
    }
}
