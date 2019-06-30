public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        int max=0,min=0;
        for(int i=0;i<l;i++)
        {
            if(arr[i]!=arr[0])
            max+=arr[i];
            if(arr[i]!=arr[l-1])
            min+=arr[i];
        }
      System.out.println(min+" "+max);


    }
