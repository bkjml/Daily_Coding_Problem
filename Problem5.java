import java.util.Scanner;
import java.util.logging.Logger;

class Pair<A, B>{
    private final A first;
    private final B second;

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }

    public A car(){
        return first;
    }
    public B cdr(){
        return second;
    }
}


public class Problem5 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Jane Street.cons(a, b) constructs a pair,
//    and car(pair) and cdr(pair) returns the first and last element of that pair.
//    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
//    Given this implementation of cons:
//    def cons(a, b):
//    def pair(f):
//            return f(a, b)
//    return pair
//    Implement car and cdr.


    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem5.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Press any key to quit or enter to continue");
        String inp = "";

        while (inp.equals("")){
            String ley = scanner.nextLine();
            String[] lines = ley.split(", ");
            Integer A = Integer.parseInt(lines[0]);
            Integer B = Integer.parseInt(lines[1]);
            Pair<Integer, Integer> pair = new Pair<>(A, B);
            System.out.println(pair.car());
            System.out.println(pair.cdr());

            logger.info("Press any key to quit or enter to continue");
            inp = scanner.nextLine();

        }
    }

}
