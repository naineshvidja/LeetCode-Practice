public class zigzagconversion {
    public String convert(String s, int numRows) {
        int i=0,j=0,count=0;
        if(s.length()==1 || numRows==1)
            return s;
        int numColumns=s.length();
        char[][] arr=new char[numRows][numColumns];
        
        while(count<s.length()){
            if(i==0){
                while(i<numRows && count!=s.length()){
                    arr[i][j]=s.charAt(count);
                    i++;
                    count++;
                }
            }
            else if(i==numRows) {
                i=numRows-2;
                while(i>=0 && count!=s.length()){
                    j++;
                    arr[i][j]=s.charAt(count);
                    i--;
                    count++;
                }
            }
            else if(i==-1){
                i=1;
                while(i<numRows && count!=s.length()){
                    arr[i][j]=s.charAt(count);
                    i++;
                    count++;
                }
            }
        }
        String ans="";
        for(i=0;i<numRows;i++){
            for(j=0;j<numColumns;j++){
                if(arr[i][j]=='\0')
                    continue;
                else 
                    ans=ans+arr[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        zigzagconversion obj= new zigzagconversion();

        //Example 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String ans1= obj.convert(s1, numRows1);
        System.out.println(ans1);

        //Example 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String ans2= obj.convert(s2, numRows2);
        System.out.println(ans2);
        
        //Example 3
        String s3 = "A";
        int numRows3 = 1;
        String ans3= obj.convert(s3, numRows3);
        System.out.println(ans3);

    }
}
