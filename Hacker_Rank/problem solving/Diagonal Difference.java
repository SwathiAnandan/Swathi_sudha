class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
   int d=0,d1=0,d2=0;
     for (int i = 0; i < arr.size(); i++) { 
            for (int j = 0; j < arr.get(i).size(); j++) { 
                if(i==j)
                d1+=arr.get(i).get(j); 
                if((j==(arr.size()-i))||((j==(arr.size()/2))&&(i==(arr.size()/2))))
                d2+=arr.get(i).get(j); 
            } 
    }
    System.out.println(d1);
 return Math.abs(d1-d2);
}
}
