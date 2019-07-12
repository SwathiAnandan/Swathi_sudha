class pattern
{
 public static void main(String args[])
 {
 int i,j,n;
 Scanner sc = new Scanner(System.in);
 n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
         for(j=i;j>=1;j--)
         {
             System.out.print((char)(j+64)+" ");
         } 
         System.out.println();
     }
 }
}
