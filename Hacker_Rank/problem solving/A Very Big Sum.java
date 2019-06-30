public class Solution {

   
    static long aVeryBigSum(long[] ar) {
        long l=0;
        for(int i=0;i<ar.length;i++)
        {
            l+=ar[i];
        }

        return l;
    }
