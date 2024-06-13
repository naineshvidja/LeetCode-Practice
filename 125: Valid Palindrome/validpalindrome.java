import java.util.*;
public class validpalindrome2{
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        if(s.length()==1 || s.length()==0)
            return true;
        Stack<Character> stack = new Stack<>();
        String ans= new String();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            stack.push(c);
        }
        
        for(int i=0;i<s.length();i++)
        {
            char sc= stack.pop();
            ans=ans+sc;
        }
        if(ans.equals(s))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        validpalindrome obj= new validpalindrome();
        
        //Example 1
        String s1 = "A man, a plan, a canal: Panama";
        Boolean b1= obj.isPalindrome(s1);
        System.out.println(b1);

        //Example 2
        String s2 = "race a car";
        Boolean b2= obj.isPalindrome(s2);
        System.out.println(b2);

        //Example 3
        String s3 = ",.";
        Boolean b3= obj.isPalindrome(s3);
        System.out.println(b3);
    }
}

