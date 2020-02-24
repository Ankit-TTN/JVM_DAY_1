
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer str = new StringBuffer(in.nextLine());
        System.out.println(str);
        str = str.reverse();
        System.out.println(str);
        try {
            str = str.delete(4, 9);
            System.out.println(str);
        } catch (Exception e){
            System.out.print(e);
        }
    }
}

