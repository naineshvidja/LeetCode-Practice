public class mergestringsalternately {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        String ans="";
        int n;
        if(n1==n2){
            n=n1;
            for(int i=0;i<n;i++){
                ans=ans+word1.charAt(i);
                ans=ans+word2.charAt(i);
            }
        }
        else if(n1<n2){
            n=n1;
            for(int i=0;i<n;i++){
                ans=ans+word1.charAt(i);
                ans=ans+word2.charAt(i);
            }
            ans=ans+word2.substring(n);
        }
        else {
            n=n2;
            for(int i=0;i<n;i++){
                ans=ans+word1.charAt(i);
                ans=ans+word2.charAt(i);
            }
            ans=ans+word1.substring(n);
        }
        return ans;
    }
    public static void main(String[] args){
        mergestringsalternately obj= new mergestringsalternately();

        //Example 1
        String word1 = "abc";
        String word2 = "pqr";
        String ans1= obj.mergeAlternately(word1, word2);
        System.out.println(ans1);

        //Example 2
        String word3 = "ab";
        String word4 = "pqrs";
        String ans2= obj.mergeAlternately(word3, word4);
        System.out.println(ans2);
        
        //Example 3
        String word5 = "abcd";
        String word6 = "pq";
        String ans3= obj.mergeAlternately(word5, word6);
        System.out.println(ans3);

    }
}
