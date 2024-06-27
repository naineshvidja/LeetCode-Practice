import java.util.LinkedList;
import java.util.List;

public class onefourthreeone {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new LinkedList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>candies[max])
                max=i;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=candies[max])
                l.add(true);
            else
                l.add(false);
        }

    return l;
    }
    public static void main(String[] args){
        onefourthreeone obj= new onefourthreeone();

        //Example 1
        int[] candies1 = {2,3,5,1,3};
        int extraCandies1 = 3;
        List<Boolean> ans1= new LinkedList<Boolean>();
        ans1=obj.kidsWithCandies(candies1, extraCandies1);
        System.out.println(ans1);
        System.out.println("------------");

        //Example 2
        int[] candies2 = {4,2,1,1,2};
        int extraCandies2 = 1;
        List<Boolean> ans2= new LinkedList<Boolean>();
        ans2=obj.kidsWithCandies(candies2, extraCandies2);
        System.out.println(ans2);
        System.out.println("------------");
    }
}
