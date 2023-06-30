import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class Problem12 {

//    There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
//    Given N, write a function that returns the number of unique ways you can climb the staircase.
//    The order of the steps matters.
//    For example, if N is 4, then there are 5 unique ways:
//            •	1, 1, 1, 1
//            •	2, 1, 1
//            •	1, 2, 1
//            •	1, 1, 2
//            •	2, 2
//    What if, instead of being able to climb 1 or 2 steps at a time,
//    you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5},
//    you could climb 1, 3, or 5 steps at a time.


    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem11.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Problem 12 ----------------------------------------------------------------");
        String inp = "";
        while(inp.equals("")){
            logger.info("Enter the step set");
            String[] input = scanner.nextLine().split(", ");
            Set<Integer> X = new HashSet<>();
            for(String i : input){
                X.add(Integer.parseInt(i));
            }
            logger.info("Now put the number of stairs: ");
            int n = scanner.nextInt();

            int ways = countWays(n, X);
            System.out.println("The number of ways to climb a " + n + "-step staircase with steps from set " + X + " is " + ways);
            System.out.println("Enter any key to quit");
            inp = scanner.nextLine();
        }
    }

    public static int countWays(int n, Set<Integer> X) {
        // Base case.
        if (n == 0) {
            return 1;
        }

        int ways = 0;
        for (int x : X) {
            if (x <= n) {
                ways += countWays(n - x, X);
            }
        }

        return ways;
    }



}
