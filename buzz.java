import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class buzz {


    public static void main(String[] args){

        String[] list = {"A", "B", "C", "D", "E", "F", "G"};
        List<Integer> result = new ArrayList<>();

        int firstnumber = 1;

        int secondnumber = 2;

        String property1 = "A";

        String property2 = "B";

        List<String> request = new ArrayList<>();

        for(String l : list){
            if(property1.equals(l)){
                request.add(property1);
            }
            if(property2.equals(l)){
                request.add(property2);
            }
        }


        while (secondnumber > result.size()) {
            if(check(firstnumber) && check(secondnumber)){
                result.add(firstnumber);
            }
            firstnumber++;
        }
    }


    public static boolean check(int args){
        return true;
    }


}
