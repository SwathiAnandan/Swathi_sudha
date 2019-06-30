public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        long  max=0,min=0;
        for(int i=0;i<l;i++)
        {
            if(i!=0)
            max+=arr[i];
            if(i!=(l-1))
            min+=arr[i];
        }
      System.out.println(min+" "+max);


    }
    
    
    
