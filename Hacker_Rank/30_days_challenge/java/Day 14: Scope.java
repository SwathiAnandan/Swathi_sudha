


class Difference {
  	private int[] elements;
  	public int maximumDifference;
      Difference(int[] e)
      {
          this.elements=e;
      }
      int computeDifference()
      {
     Arrays.sort(elements);
     int l=elements.length;
     maximumDifference=elements[l-1]-elements[0];
     return maximumDifference;
     }



