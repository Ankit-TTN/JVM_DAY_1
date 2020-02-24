import java.util.Scanner;
import java.util.HashMap;
public class Ques5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Boolean> hash = new HashMap<>();
        HashMap<String,String> hashTwo = new HashMap<>();
        String[] listOne,listTwo;
        System.out.print("Enter Integer Elements for ListOne (Space Separated): ");
        listOne = in.nextLine().split(" ");
        System.out.print("Enter Integer Elements for ListTwo (Space Separated): ");
        listTwo = in.nextLine().split(" ");
        for (String s : listOne) {
            hash.put(s,true);
        }
        for (String s : listTwo) {
            if(hash.containsKey(s)){
                hashTwo.put(s,s);
            }
        }
        for (Object value : hashTwo.values()) {
            System.out.print(value+" ");
        }
    }
}
