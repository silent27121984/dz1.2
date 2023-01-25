import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list = new ArrayList<>();
        for (int x : intList){
            if (x > 0 && x % 2 == 0) {
                list.add(x);
           }
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.println(x);
        }
    }
}
