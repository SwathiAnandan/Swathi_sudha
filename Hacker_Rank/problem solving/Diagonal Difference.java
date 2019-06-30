class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
     int d=0,d1=0,d2=0;
        for (int i = 0; i < arr.size(); i++) { 
        d1 += arr.get(i).get(i); 
        d2 += arr.get(i).get(arr.size() - i - 1);         
    } 
    d =d1-d2;

 return Math.abs(d);
}
