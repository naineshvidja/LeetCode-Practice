import java.util.Stack;

public class reversewordsinastring {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        s=s+" ";

        Stack<String> stk= new Stack<>();
        String words="";
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                stk.push(words);
                words="";
            }
            else{
                words=words+s.charAt(i);
            }
        }

        words="";
        while(!stk.isEmpty()){
            words=words+stk.pop();
            words=words+" ";
        }
        return words.trim();   
    }
    public static void main(String[] args) {
        reversewordsinastring obj= new reversewordsinastring();

        //Example 1
        String s1="      the sky is      blue";
        String ans1= obj.reverseWords(s1);
        System.out.println(ans1);
        System.out.println("-------------------");

        //Example 1
        String s2="  a        good   example      ";
        String ans2= obj.reverseWords(s2);
        System.out.println(ans2);
        System.out.println("-------------------");
    }
}
