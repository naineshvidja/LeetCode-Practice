public class sevenoneseven {

    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
        while(i<n-1){
            if(bits[i]==1)
                i=i+2;
            else
                i++;
        }
        if(i==n-1)
            return true;
        
        return false;
    }
    public static void main(String[] args){
        sevenoneseven obj= new sevenoneseven();
        
        //Example 1
        int[] bits1={1,0,0};
        boolean flag1= obj.isOneBitCharacter(bits1);
        System.out.println(flag1);

        //Example 2
        int[] bits2={1,1,1,0};
        boolean flag2= obj.isOneBitCharacter(bits2);
        System.out.println(flag2);

    }
    
}
