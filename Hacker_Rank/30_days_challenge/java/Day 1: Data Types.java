


public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i1=scan.nextInt();
        double d1=scan.nextDouble();
        scan.nextLine();
        String s1=scan.nextLine();
        s=s.concat(s1);

        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s);

    }
}

