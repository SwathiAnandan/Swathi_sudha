
//whether the number is the product of single digit number
//prime or not

class prime{  
public static void main(String args[])  
{    
 int f=0;    
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(i=2;i<n;++i)
 {    
 if(n%i==0)
 {
 f=1;
 break;
 }
 }  
 if(f==1)
 System.out.println("yes");
 if(f==0)
 System.out.println("no");
  
}}  
