class twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;
        int[] ans=new int[2];
        int n = nums.length;
        int flag=0;
        
        for (int i = 0; i < n - 1;i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    flag=1;
                    break;
                }    
            }
            if(flag==1)
                break;
        }
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ,");
        }
    }
    
}
