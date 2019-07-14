## Printing the pattern ##
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *









public class Main
{
public static void main(String[] args) {
		int i,j,fstar,bstar,spaces;
		int n=6;
			for(i=0;i<n;i++) {
					 fstar=n-i;
					 bstar=n-i;
					 spaces=(2*n)-(fstar+bstar);
				
			for(j=1;j<fstar;j++) {
				 System.out.print(" ");
			}
				 for(j=0;j<spaces+2;j++) {
					 System.out.print("*");
				 }
					 for(j=1;j<bstar;j++) {
						 System.out.print(" ");
					 }
	
			System.out.println();

		}
		
		
		
		for(i=0;i<n;i++) {
		 fstar=i+1;
		 bstar=i+1;
		 spaces=2*n-(fstar+bstar);
		 for(j=0;j<fstar;j++) {
			 System.out.print(" ");
		 }
			 for(j=0;j<spaces;j++) {
				 System.out.print("*");
			 }
				 for(j=0;j<bstar;j++) {
					 System.out.print(" ");
				 }
			System.out.println();	 
		}
		
		
	}
	}
