
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Problem1 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was recently asked by Google.
//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//    Bonus: Can you do this in one pass?

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem1.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "press q to quit or any");
        String inp = "";

        while(inp.equals("")){
            try{
                logger.log(Level.INFO, "Enter the list of numbers using commas without space when you finish press enter: ");
                String input = scanner.nextLine();

                String[] numbers = input.split(", ");

                List<Integer> listOfNumbers = new ArrayList<>();

                for(String number : numbers){
                    listOfNumbers.add(Integer.parseInt(number));
                }


                logger.log(Level.INFO, "Enter the value K: ");
                Integer value = scanner.nextInt();

                for(int i = 0; i < listOfNumbers.size(); i++){
                    for(int j = i+1; j < listOfNumbers.size(); j++){
                        if(listOfNumbers.get(j) + listOfNumbers.get(i) == value){
                            logger.log(Level.INFO, "True");
                            System.out.println(listOfNumbers.get(i) +" + " + listOfNumbers.get(j) + "=" + value);
                        }
                    }
                }
                logger.log(Level.INFO, "press q to quit or any other to continue");
                inp = scanner.nextLine();
            }catch (Exception e){
                logger.log(Level.INFO, "press q to quit or any other to continue");
                inp = scanner.nextLine();

            }

        }



    }



}
