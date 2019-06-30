  static void staircase(int n) {

        char c='#';
      
            for(int j=0;j<=n;j++){
                for(int i=n-j;i>0;i--)
                {
                  System.out.print(" ");   
                }
              for(int k=j;k>0;k--){
               System.out.print(c); 
              }
              System.out.println(); 
              }
        
      
    }
