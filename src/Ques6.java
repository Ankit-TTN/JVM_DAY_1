import java.util.HashMap;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> hash= new HashMap<>();
        System.out.println("Enter Values Space Separated");
        String[] arr = in.nextLine().split(" ");
        for (String s : arr) {
            if (hash.containsKey(s)) {
                hash.put(s,hash.get(s) + 1);
            } else {
                hash.put(s, 1);
            }
        }

        for (Object o : hash.keySet()) {
            int val = hash.get(o);
            if (val == 1) {
                System.out.println(o);
                break;
            }
        }
    }
}
