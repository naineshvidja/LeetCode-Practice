public class twosix {
    public int removeDuplicates(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            else{
                nums[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        twosix obj = new twosix();

        //Example 1
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4};
        int k= obj.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.print("[");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println("]");
    }
}
