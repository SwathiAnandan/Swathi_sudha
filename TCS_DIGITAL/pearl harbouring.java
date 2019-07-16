import java.util.*;

 class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int me=sc.nextInt();
	  int v[]=new int[n];
	  int e[]=new int[n];
    int p=0,g=0;
	  
	   for(int i1=0;i1<n;i1++)
	   v[i1]=sc.nextInt();
	    for(int i2=0;i2<n;i2++)
	   e[i2]=sc.nextInt();
	  
	  for(int i=0;i<n;i++)
	  {
	      for(int j=i+1;j<n;j++)
	      {
	        if((e[i]+e[j])<=me)
          p=v[i]+v[j];
         
         if(p>g)
         g=p;
	        
	      }
	  }
	  System.out.println(g);
	}
}
