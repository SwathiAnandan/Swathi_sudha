
public class Solution {
    
    static int sum_I(int r,int c,int arr[][])
    {
         int sum=0,d=0;
      for(int i=r+0;i<r+3;i++)
      {
         for(int j=c+0;j<c+3;j++)
         {
          sum+=arr[i][j];
          if(((r+1)==i && c==j)||((r+1)==i && (c+2)==j))
          d+=arr[i][j];
         } 
      }
      sum=sum-d;
      return sum; 
      
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int s=0,gs=-300,g_a=0,g_b=0;
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
       for(int a = 0; a < 4; a++)
       {
           for (int b = 0; b < 4; b++)
           {
            
              s=sum_I(a,b,arr);
              if(gs<s)
               gs=s;
            
           }
       }
       System.out.println(gs); 
        }
        }




