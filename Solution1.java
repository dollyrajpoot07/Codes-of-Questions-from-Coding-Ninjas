import java.util.*;

class Solution1 {
    public static int getPopulationInYear(int year) {
        Scanner sc = new Scanner(System.in);
        int firstYear = 2002;
        int finalYear = year - firstYear;
        int totalPop = 1256;
        int[] born = {37, 89, 92, 34, 76, 44};
        int[] dead = {9, 81, 10, 12, 17, 56};
        for(int i = 0; i < finalYear; i++) {
            totalPop = (totalPop + born[i]) - dead[i];
            // System.out.println("Population in is: " + totalPop);
        }
        sc.close();
        return totalPop;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int res = getPopulationInYear(year);
        System.out.println("Final Population is: " + res);
        sc.close();
    }
}
