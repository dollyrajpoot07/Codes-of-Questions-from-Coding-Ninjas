import java.util.*;

class Solution {
    public static int getPopulationInYear(int end) {
        Scanner sc = new Scanner(System.in);
        int totalPop = 1256;
        int start = 0;
        for(int i = start; i < end; i++) {
            System.out.print("enter no of born: ");
            int born = sc.nextInt();
            System.out.print("enter no of dead: ");
            int dead = sc.nextInt();
            totalPop = (totalPop + born) - dead;
            System.out.println("Population in is: " + totalPop);
        }
        sc.close();
        return totalPop;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter firstYear: ");
        int firstYear = sc.nextInt();
        System.out.print("enter secondYear: ");
        int secondYear = sc.nextInt();
        int end = secondYear- firstYear + 1;
        int res = getPopulationInYear(end);
        System.out.println("Final Population is: " + res);
        sc.close();
    }
    public void run() {
    }
}