//given a integer n, the task is the check the factorial of the value n is divisble by the sum of the squares of the n natual numbers 


import java.util.*;
class Main{  
 public static void main(String args[]){  
  int i,fact=1,s=0; 
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=n;i++){    
      fact=fact*i;  
   s+=i*i;
  }    
  if(fact%s==0)
  System.out.println("yes ");  
  else
    System.out.println("no");   
 }  
}  
