public class uniquenoofoccurences 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,2,1,1,3};
        int arrSize=arr.length;
        boolean ans;
        
        
        int occ, i, j=0, k;
        int value, temp;
        int occarray[]=new int[1000];
        
        for (i = 0; i < arrSize - 1; i++) {
            for (j = 0; j < arrSize - i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    
        value = arr[0];
        occ = 1;
    
        for (i = 1; i < arrSize; i++) {
            if (value == arr[i]) {
                occ++;
            }
    
            else {
                occarray[j] = occ;
                j = j + 1;
                value = arr[i];
                occ = 1;
            }
        }
        occarray[j] = occ;
    
        for (i = 0; i < 24; i++) {
            for (j = i+1; j < 25; j++) {
                if (occarray[i] == 0 || occarray[j] == 0) {
                    continue;
                } 
                else if (occarray[i] == occarray[j]) {
                    ans=false;
                    break;
                }
                else {
                    k = 1;
                }
    
                
            }
        }
    
        ans= true;
        System.out.println(ans);
    }    
}
