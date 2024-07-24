public class sortthejumbledno {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        int[][] ans=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){

            String s= Integer.toString(nums[i]);
            for(int j=0;j<s.length();j++){
                int m=mapping[(s.charAt(j) - '0')];
                ans[i][1]=ans[i][1]*10 + m;
            }
            ans[i][0] = nums[i];
            
        }

        java.util.Arrays.sort(ans, java.util.Comparator.comparingDouble(a -> a[1]));
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i][0];
        }

        return nums;
    }
    public static void main(String[] args) {
        sortthejumbledno obj= new sortthejumbledno();

        //Example 1
        int[] mapping1 = {8,9,4,0,2,1,3,5,7,6};
        int[] nums1 = {991,338,38};
        int[] ans1= obj.sortJumbled(mapping1, nums1);
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+"| ");
        }

        System.out.println(" ");
        
        //Example 2
        int[] mapping2 = {0,1,2,3,4,5,6,7,8,9};
        int[] nums2 = {789,456,123};
        int[] ans2= obj.sortJumbled(mapping2, nums2);
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans2[i]+"| ");
        }
    }
}
