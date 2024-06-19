import java.util.Stack;

public class twozerozerozero {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        char[] arr= word.toCharArray();
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<=index;i++){
            stk.push(arr[i]);
        }
        for(int i=0;i<=index;i++){
            arr[i] = stk.pop();
        }
        String ans= new String(arr);
        return ans;
    }
    public static void main(String[] args){
        twozerozerozero obj= new twozerozerozero();

        //Example 1
        String word1 = "abcdefd";
        char ch1 = 'd';
        String res1= obj.reversePrefix(word1, ch1);
        System.out.println(res1);

        //Example 2
        String word2 = "xyxzxe";
        char ch2 = 'z';
        String res2= obj.reversePrefix(word2, ch2);
        System.out.println(res2);
    }
}
