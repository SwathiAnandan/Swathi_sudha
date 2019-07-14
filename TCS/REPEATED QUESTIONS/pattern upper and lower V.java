

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

OTHER SOLUTION

AUTHOR:KRISHNA DEEPTHI 

public class Main
{
public static void main(String[] args) {
		int i,j,fstar,bstar,spaces;
		int n=5;
		for(i=0;i<n;i++) {
		 fstar=i+1;
		 bstar=i+1;
		 spaces=2*n-(fstar+bstar);
		 for(j=0;j<fstar;j++) {
			 System.out.print("*");
		 }
			 for(j=0;j<spaces;j++) {
				 System.out.print(" ");
			 }
				 for(j=0;j<bstar;j++) {
					 System.out.print("*");
				 }
			System.out.println();	 
		}
			for(i=0;i<n;i++) {
					 fstar=n-i;
					 bstar=n-i;
					 spaces=2*n-(fstar+bstar);
				
			for(j=1;j<fstar;j++) {
				 System.out.print("*");
			}
				 for(j=1;j<spaces+2;j++) {
					 System.out.print(" ");
				 }
					 for(j=1;j<bstar;j++) {
						 System.out.print("*");
					 }
	
			System.out.println();

		}
	}
	}
