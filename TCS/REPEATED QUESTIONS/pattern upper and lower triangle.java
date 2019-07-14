

*        *                                                                  
**      **                                                                  
***    ***                                                                  
****  ****                                                                  
**********                                                                  
****  ****                                                                  
***    ***                                                                  
**      **                                                                  
*        *                                                                  







public class Main
{
    public static void space(int n)
  {
      for(int i=0;i<n;i++)
      System.out.print(" ");
  }
  public static void star(int n)
  {
      for(int i=0;i<n;i++)
      System.out.print("*");
      
  }
	public static void main(String[] args) {
    int n=10,st=1,s=0, flag=0;
     if(n%2!=0)
     flag=1;
   for(int i=1;i<n/2;i++)
    {
      s=n-(st*2);
      star(i);
      space(s);
      star(i);
      st++;
      System.out.println();
    }
    st=0;
   if(flag==1)
    System.out.print("*");
    for(int i=n/2;i>0;i--)
    {
      s=st*2;
      star(i);
      if(flag==1 && s>0)
      space(s+1);
      else
       space(s);
      
      star(i);
      st++;
      System.out.println();
    }
	    
	
    
        }
}
