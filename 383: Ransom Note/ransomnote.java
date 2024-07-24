import java.util.HashMap;

public class ransomnote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            if(!map.containsKey(magazine.charAt(i))){
                
                map.put(magazine.charAt(i),1);
            }
            else{
                map.put( magazine.charAt(i), map.get(magazine.charAt(i)) +1);
            }
        }

        Boolean ans=true;
        for(int i=0;i<ransomNote.length();i++){
            if(map.containsKey(ransomNote.charAt(i))==true && map.get(ransomNote.charAt(i)) != 0){
                map.put( ransomNote.charAt(i), map.get(ransomNote.charAt(i)) -1);
            }
            else{
                ans=false;
                
            } 
        }
        return ans;        
    }
    public static void main(String[] args) {
        ransomnote obj= new ransomnote();
        
        //Example 1
        String ransomNote1 = "a";
        String magazine1 = "b";
        Boolean ans1= obj.canConstruct(ransomNote1, magazine1);
        System.out.println(ans1);
        
        //Example 2
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        Boolean ans2= obj.canConstruct(ransomNote2, magazine2);
        System.out.println(ans2);
        
        //Example 3
        String ransomNote3 = "aab";
        String magazine3 = "baa";
        Boolean ans3= obj.canConstruct(ransomNote3, magazine3);
        System.out.println(ans3);
    }
}
