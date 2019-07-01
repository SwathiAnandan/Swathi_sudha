public class Solution {

    static int birthdayCakeCandles(int[] ar) {
     Arrays.sort(ar);
     int c=0;
     int a=ar[ar.length-1];
     for(int i=(ar.length-1);i>=0;i--)
     {
         if(ar[i]==a)
         c++;
     }

    return c;

    }
