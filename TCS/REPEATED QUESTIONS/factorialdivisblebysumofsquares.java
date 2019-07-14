//given a integer n, the task is the check the factorial of the value n is divisble by the sum of the squares of the n natual numbers 

class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1,s=0;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;  
   s+=i*i;
  }    
  if(f%s==0)
  System.out.println("yes ");  
  else
    System.out.println("no");   
 }  
}  



