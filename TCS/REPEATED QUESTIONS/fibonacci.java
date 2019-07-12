/*
sum of squares of the fibonacci series for the given number*/

class Fibonacci{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,s=1;    
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(i=1;i<n;++i)
 {    
  n3=n1+n2;    
  s=s+(n3*n3); 
  n1=n2;    
  n2=n3;    
 }  
 System.out.println(s);
  
}}  
