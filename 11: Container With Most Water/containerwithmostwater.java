public class containerwithmostwater {
    public int maxArea(int[] height) {
        int area=0;
        
        int i=0;
        int k=height.length-1;

        while(i<k){
            int breadth=k-i;
            int length=Math.min(height[k],height[i]);
            int currentarea=length*breadth;
            if(currentarea>area)
                area=currentarea;

            if (height[i] < height[k]) 
                i++;
            else
                k--;

        }
  
        return area;
    }
    public static void main(String[] args){
        containerwithmostwater obj= new containerwithmostwater();

        //Example 1
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int area1 = obj.maxArea(height1);
        System.out.println(area1);

        //Example 2
        int[] nums2 = {0,1,1};
        int area2 = obj.maxArea(nums2);
        System.out.println(area2);
    }    
}
