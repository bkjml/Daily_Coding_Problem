import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

public class Problem10 {

//    Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.


    public static void main(String[] args){
        Logger logger = Logger.getLogger(Problem10.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Starting job scheduler");
        String input = "";
        while (input == ""){
            logger.info("Enter the milliseconds:");
            int milliseconds = scanner.nextInt();
            Runnable myFunction = () -> System.out.println("Hello, world!");
            scheduler(myFunction, milliseconds);
            logger.info("enter any letter to quit!");
            input = scanner.nextLine();
        }

    }
    public static void scheduler(Runnable runnable, int n) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run(){
                runnable.run();
                timer.cancel();
            }
        }, n);

    }

}
