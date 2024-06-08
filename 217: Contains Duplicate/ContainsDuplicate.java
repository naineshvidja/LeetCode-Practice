import java.util.*;
class containsduplicate{
    public static void main(String[] args) {
        int[] nums= {1,2,3,1};
        boolean answer;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                answer=true;
            }
            map.put(nums[i],1);
        }
        answer=false;
        System.out.println(answer);
    }
}
