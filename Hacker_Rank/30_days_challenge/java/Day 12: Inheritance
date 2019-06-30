
class Student extends Person{
	private int[] testScores;
     public Student(String first,String last,int id,int a[])
     {
     super(first,last,id);
     this.testScores=a;
     }

 
    public char calculate()
    {
        int sum=0;
       for(int i : this.testScores)
            {
            sum+=i;
        }
        sum= sum/testScores.length;
      
          if(sum>=90&&sum<=100)
              return 'O';
           else if (sum>=80&&sum<=90)
            return 'E'; 
            else if (sum>=70&&sum<=80)
              return 'A';
           else if (sum>=55&&sum<=70)
              return 'P';
           else if (sum>=40&&sum<=55)
              return 'D';
           else 
              return 'T';
             
     
    }
}


