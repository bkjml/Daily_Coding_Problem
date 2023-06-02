import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Problem4 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Stripe.
//    Given an array of integers, find the first missing positive integer in linear time and constant space.
//    In other words, find the lowest positive integer that does not exist in the array.
//    The array can contain duplicates and negative numbers as well.
//    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//    You can modify the input array in-place.

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem4.class.getName());
        Scanner scanner = new Scanner(System.in);
        String inp = "";
        while (inp.equals("")){
            logger.info("Input your list with comma separated");
            String input = scanner.nextLine();
            String[] lines = input.split(", ");
            List<Integer> listOfNumbers = new ArrayList<>();
            for(String line : lines) {
                listOfNumbers.add(Integer.parseInt(line));
            }

            int result = findMissingNumber(listOfNumbers);
            System.out.println(result);

            logger.info("enter any key to quit");
            inp = scanner.nextLine();

        }
//2, 0, 9, 6, 5, 4, 1, 3
    }
    public static int findMissingNumber(List<Integer> numbers){

        int n = numbers.size();
        System.out.println(n);

        for(int i = 0; i < n; i++){
            if(numbers.get(i) > 0 && numbers.get(i) <= n){
                numbers.set(numbers.get(i) - 1, -1);
//                System.out.println(numbers.get(i) - 1);
//                System.out.println(numbers.get(i-1));
            }
        }
        System.out.println(numbers);
        // Find the first index where the number is not negative.
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) > 0) {
                return i + 1;
            }
        }

        // If all the numbers are present in the array, then the first missing positive integer is n + 1.
        return n + 1;
    }

}
