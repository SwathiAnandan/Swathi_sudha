public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int pointsAlice=0,pointsBob=0;
         List<Integer> l = new ArrayList<Integer>();  
        for(int i=0;i<a.size();i++)
        {
          if(a.get(i)>b.get(i))
            pointsAlice++;
          else if(a.get(i)<b.get(i))
            pointsBob++;
              
        }
  l.add(pointsAlice);
  l.add(pointsBob);
  return l;


    }
