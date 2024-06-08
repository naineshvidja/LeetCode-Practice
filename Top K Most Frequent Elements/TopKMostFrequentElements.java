import java.util.*;
public class TopKMostFrequentElements{
    public static void main(String args[]) 
    {
        int i;
        int k=10;  // Kth Most Frequent Elements
        int nums[] = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};  // Given Array
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>(); // HashMap for frequency table
        for(i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        System.out.println(map);

        int arr[][] = new int[map.size()][2];
        int j=0;
        for(Map.Entry<Integer,Integer> r: map.entrySet())  //copying the hashmap to a 2d array
        {
            arr[j][0]=r.getKey();
            arr[j][1]=r.getValue();
            j++;
        }

        Arrays.sort(arr, (a,b)->Integer.compare(b[1],a[1])); //sorting the 2d array in descending (according to values)

        int res[]=new int[k];
        System.out.print("[");
        for(i=0;i<k;i++) // 
        {
            res[i]=arr[i][0];
            System.out.print(+res[i]+",");
            
        } 
        System.out.print("]");      
    }
}
