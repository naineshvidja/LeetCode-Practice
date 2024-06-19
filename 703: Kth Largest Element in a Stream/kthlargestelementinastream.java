import java.util.*;
public class kthlargestelementinastream {
    
    public int K;
    ArrayList<Integer> list= new ArrayList<>();

    public kthlargestelementinastream(int k, int[] nums) {
        K=k;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }    
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list,Collections.reverseOrder());
        return list.get(K-1);
    }

    public static void main(String[] args){
        int[] nums= {4, 5, 8, 2};
        kthlargestelementinastream obj= new kthlargestelementinastream(3, nums);
        
        //Example 1
        int ans1= obj.add(3);
        System.out.println(ans1);

        //Example 2
        int ans2= obj.add(5);
        System.out.println(ans2);

        //Example 3
        int ans3= obj.add(10);
        System.out.println(ans3);

        //Example 4
        int ans4= obj.add(9);
        System.out.println(ans4);

        //Example 4
        int ans5= obj.add(4);
        System.out.println(ans5);
    }
}
