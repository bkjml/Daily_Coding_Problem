import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Problem7 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Facebook.
//    Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
//    For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
//    You can assume that the messages are decodable. For example, '001' is not allowed.



    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem7.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter any key to quit?: ");
        String inp = "";
        while (inp.equals("")){
            logger.info("Enter the number?: ");
            String number = scanner.nextLine();
            counter(Integer.valueOf(number));
            logger.info("Enter any key to quit?: ");
            inp = scanner.nextLine();
        }
    }


    public static void counter(Integer num){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(num);


        for(int i = num.toString().length(); i > 1 ; i--){
            Integer input = num;
            while(input > 0){
                int digit = (int) (input % Math.pow(10, (i - 1)));
                if(!numbers.contains(digit)){
                    numbers.add(digit);
                }
                input /= 10;
            }
        }

        System.out.println("numbers: "+ numbers);
        System.out.println("Count: " + numbers.size());
    }

}
