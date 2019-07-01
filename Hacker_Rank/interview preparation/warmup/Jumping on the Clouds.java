public class Solution {

    static int jumpingOnClouds(int[] c) {
        int n=c.length,j=0;
     for(int i=0;i<n-3;i++)
     {
       if(c[i+2]==0)
       {
         j++;
         i++; 
       }
      
       else if(c[i+1]==0 && c[i+2]==1)
           j++;
      
     }

return j+1;

    }
