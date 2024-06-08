public class productexceptself {
    
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        
        int n=nums.length;
        int x=1;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            x=1;
            for(int j=0;j<n;j++){
                if(j==i)
                    continue;
                else
                    x=x*nums[j];
            }
            ans[i]=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    
}
