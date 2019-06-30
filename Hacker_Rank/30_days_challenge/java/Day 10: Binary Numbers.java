
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String b=Integer.toBinaryString(n);
        char[] c=b.toCharArray();
        int count=0,c1=0;
        for(int i=0;i<c.length;i++)
        {
          if(c[i]=='1')
            c1++;
          else
          {
          if(c1>count)
            {
            count=c1;
            c1=0;
            }
          }
        }
        System.out.println(count);

        scanner.close();
    }
}

SIMPLE SOLUTION

String b = Integer.toString(n, 2);
    String[] sub_str = b.split("0");
     int c=0;
    for(int i=0;i<sub_str.length;i++ ){
        if (c< sub_str[i].length()) 
        c = sub_str[i].length();
    }
    System.out.println(c);  
