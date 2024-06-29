import java.util.Stack;

public class reversevowelsofastring {
    public String reverseVowels(String s) {
        Stack<Character> stk= new Stack<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U'){
                stk.push(arr[i]);
            }
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U'){
                arr[i]=stk.pop();
            }
            ans=ans+arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        reversevowelsofastring obj= new reversevowelsofastring();

        //Example 1
        String s1="hello";
        String ans1= obj.reverseVowels(s1);
        System.out.println(ans1);

        //Example 2
        String s2="leetcode";
        String ans2= obj.reverseVowels(s2);
        System.out.println(ans2);

        //Example 2
        String s3="Encyclopedia";
        String ans3 = obj.reverseVowels(s3);
        System.out.println(ans3);
    }
}
