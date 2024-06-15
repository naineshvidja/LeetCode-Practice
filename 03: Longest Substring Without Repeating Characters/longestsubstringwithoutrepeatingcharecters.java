import java.util.HashMap;
import java.util.Map;

public class longestsubstringwithoutrepeatingcharecters {
    public int lengthOfLongestSubstring(String s) {
        int ans=1;
        int n=s.length();
        if(n==0)
            return 0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
                if(i==n-1){
                    String result="";
                    for(Map.Entry<Character,Integer> e: map.entrySet()){
                        result=result+e.getKey();
                    }
                    if(result.length()>ans)
                        ans=result.length();
                }
            }
            else
            {
                String result="";
                for(Map.Entry<Character,Integer> e: map.entrySet()){
                    result=result+e.getKey();
                }
                if(result.length()>ans)
                    ans=result.length();

                map.clear();
                int j=i-1;
                while(s.charAt(j)!=s.charAt(i)){
                    j--;
                }
                int diff=i-j;
                for(int k=0;k<diff;k++){
                    map.put(s.charAt(i-k),1);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args){
        longestsubstringwithoutrepeatingcharecters obj= new longestsubstringwithoutrepeatingcharecters();

        //Example 1
        String s1 ="abcabcbb";
        int ans1=obj.lengthOfLongestSubstring(s1);
        System.out.println(ans1);

        //Example 2
        String s2 ="nfpdmpi";
        int ans2=obj.lengthOfLongestSubstring(s2);
        System.out.println(ans2);

        //Example 3
        String s3 ="pwwkew";
        int ans3=obj.lengthOfLongestSubstring(s3);
        System.out.println(ans3);

    }       
}
