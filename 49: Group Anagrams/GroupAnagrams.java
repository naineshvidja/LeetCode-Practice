import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
    
        for(String ite: strs)
        {
            char[] ch= ite.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);

            map.putIfAbsent(key, new LinkedList<String>());

            map.get(key).add(ite);
        }
        return new LinkedList<>(map.values());
    }
    public static void main(String[] args){
        GroupAnagrams ga= new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ll= new LinkedList<>();
        ll=ga.groupAnagrams(strs);
        System.out.println(ll);
    }
}
