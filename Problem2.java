import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Problem2 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Uber.
//    Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//    Follow-up: what if you can't us division?

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Problem2.class.getName());
        logger.log(Level.INFO, "Enter any key to quit:");
        String input = "";
        while(input.equals("")){
            logger.log(Level.INFO, "Enter the list with comma and space: ");
            String keys = scanner.nextLine();
            String[] key_input = keys.split(", ");

            List<Integer> listOfNumbers = new ArrayList<>();
            List<Integer> result = new ArrayList<>();
            for(String key : key_input){
                listOfNumbers.add(Integer.parseInt(key));
            }
//            Integer sum = 1;
//            for (Integer n : listOfNumbers){
//
//                sum = sum * n;
//
//            }
//            for(Integer n : listOfNumbers){
//                result.add(sum/n);
//            }
//            System.out.println("Result: " + result);


            for(int i = 0; i < listOfNumbers.size(); i++){
                Integer sum = 1;
                for(Integer n : listOfNumbers){
                    if(!listOfNumbers.get(i).equals(n)){
                        sum = sum * n;
                    }
                }
                result.add(sum);
            }
            System.out.println("Result: " + result);



            logger.info("Enter any key to quit");
            input = scanner.nextLine();

        }


    }

}
