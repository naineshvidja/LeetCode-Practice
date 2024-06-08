class romantointeger {
    public static void main(String[] args) {
        String s="MCMXCIV";
        
        int x=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                if(i<n-1){
                    if(s.charAt(i+1)=='V' || s.charAt(i+1)=='X')
                        x=x-1;
                    else
                        x=x+1;
                }
                else
                    x=x+1;        
            }
            else if(s.charAt(i)=='V')
                x=x+5;
            else if(s.charAt(i)=='X'){
                if(i<n-1){
                    if(s.charAt(i+1)=='L' || s.charAt(i+1)=='C')
                        x=x-10;
                    else
                        x=x+10;
                }
                else
                    x=x+10;        
            }
            else if(s.charAt(i)=='L')
                x=x+50;
            else if(s.charAt(i)=='C'){
                if(i<n-1){
                    if(s.charAt(i+1)=='D' || s.charAt(i+1)=='M')
                        x=x-100;
                    else
                        x=x+100;
                }
                else
                    x=x+100;

            }
            else if(s.charAt(i)=='D')
                x=x+500;
            else if(s.charAt(i)=='M')
                x=x+1000;
            
        }
        System.out.println("Number="+x);
    }
}
