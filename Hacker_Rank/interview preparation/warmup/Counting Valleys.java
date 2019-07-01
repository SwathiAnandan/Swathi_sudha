public class Solution {

   
    static int countingValleys(int n, String s) {
        char [] a=s.toCharArray();
        
        int b=0,c=0;
        for(int i=0;i<n;i++)
        {
         if(a[i]=='U') 
         b++;
         else 
         b--;  
        if(b==0 && a[i]=='U')
         c++;
        }
       
        return c;
    }
