import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Problem9 {

//    Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
//    Numbers can be 0 or negative.
//    For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10,
//    since we pick 5 and 5.
//    Follow-up: Can you do this in O(N) time and constant space?


    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem9.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Problem 9--------------------------------");
        String quiter = "";
        while (quiter == ""){
            logger.info("Enter numbers with comma and space separated");
            String input = scanner.nextLine();
            List<Integer> numbers = new ArrayList<>();
            String[] inputs = input.split(", ");
            for(String inp  : inputs) {
                numbers.add(Integer.parseInt(inp));
            }
            System.out.println("The result is: " + addNumbers(numbers));
            logger.info("Enter any key to quit");
            quiter = scanner.nextLine();
        }
    }

    private static int addNumbers(List<Integer> numbers){
        int sum = 0;
        for(int i = 0; i<numbers.size(); i += 2){
            sum += numbers.get(i);
        }
        return sum;
    }

}
