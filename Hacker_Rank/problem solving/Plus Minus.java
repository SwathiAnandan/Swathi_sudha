public class Solution {

    static void plusMinus(int[] arr) {
        double z=0,e=0,o=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            z++;
            else if(arr[i]>0 && arr[i]!=0)
            e++;
            else
            o++;
        }

      
       System.out.format("%.6f\n", e/arr.length);
       System.out.format("%.6f\n", o/arr.length);
        System.out.format("%.6f\n", z/arr.length);
    }
