class canplaceflowers{
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1 || flowerbed[0]==1 && n==0)
                return true;
        }
        
        for(int i=0;i<flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                    if(n==0)
                        break;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){    
                    flowerbed[i]=1;
                    n--;
                    if(n==0)
                        break;
                }
            }
            else{
                if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                    if(n==0)
                        break;
                }
            }
        }
        if(n==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        canplaceflowers obj= new canplaceflowers();

        //Example 1
        int[] flowerbed1 = {1,0,0,0,1};
        int n1=1;
        Boolean ans1= obj.canPlaceFlowers(flowerbed1, n1);
        System.out.println(ans1);

        //Example 2
        int[] flowerbed2 = {1,0,0,0,1};
        int n2=2;
        Boolean ans2= obj.canPlaceFlowers(flowerbed2, n2);
        System.out.println(ans2);

        //Example 3
        int[] flowerbed3 = {0};
        int n3=1;
        Boolean ans3= obj.canPlaceFlowers(flowerbed3, n3);
        System.out.println(ans3);
    }   
}
