import java.util.*;
class validparenthesis
{
    public static void main(String[] args) {
        String s= "()[]{}" ;
        boolean ans;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                ans = false;
        }
        ans=stack.isEmpty();
        System.out.println(ans);
    }
}
