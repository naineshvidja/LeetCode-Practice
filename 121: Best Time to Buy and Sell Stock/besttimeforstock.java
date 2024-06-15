public class besttimeforstock {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=n-1;
        int min;
        int profit=0;
        for(int j=n-2;j>0;j--){
            if(prices[j]>prices[max])
                max=j;
        }
        int j=n-1;
        int i=0;
        while(i<n-1){
            min=i;
            if(min<max){
                if(prices[max]-prices[min]>=profit)
                    profit=prices[max]-prices[min];
            }
            else{
                max=n-1;
                for(j=n-1;j>i;j--){
                    if(prices[j]>prices[max])
                        max=j;
                }
                if(prices[max]-prices[min]>=profit)
                    profit=prices[max]-prices[min];
            }    
            i++;
        }
        return profit;
    }
    public static void main(String[] args){
        besttimeforstock obj= new besttimeforstock();

        //Example 1
        int[] prices1 = {7,1,5,3,6,4};
        int profit1 = obj.maxProfit(prices1);
        System.out.println(profit1);

        //Example 2
        int[] prices2 = {3,3,5,0,0,3,1,4};
        int profit2 = obj.maxProfit(prices2);
        System.out.println(profit2);
    }
}
