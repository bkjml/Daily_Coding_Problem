import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Problem11 {

//    Implement an autocomplete system. That is, given a query string s and
//    a set of all possible query strings, return all strings in the set that have s as a prefix.
//    For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem11.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Problem 11 ----------------------------------------------------------------");
        String inp = "";
        while(inp.equals("")){
            logger.info("Enter the String");
            String[] input = scanner.nextLine().split(", ");
            logger.info("Now put the string: ");
            String finder = scanner.nextLine();

            System.out.println(getString(finder, input));
            System.out.println("Enter any key to quit");
            inp = scanner.nextLine();
        }

    }

    public static List<String> getString(String s, String[] strings){

        List<String> result = new ArrayList<String>();

        for(String str: strings){
            if(str.startsWith(s)){
                result.add(str);
            }
        }

        return result;
    }

}
