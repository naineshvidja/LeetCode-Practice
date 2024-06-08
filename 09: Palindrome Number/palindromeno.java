class palindromeno {
    public static void main(String[] args) {
        int x=121;
        boolean ans=false;
        
        if (x < 0) {
            ans= false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if(reversed == x)
            ans=true;
      
        System.out.println(ans);
    }
    
}
