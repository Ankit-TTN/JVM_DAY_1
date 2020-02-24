import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str,sub,repl;
        System.out.println("Enter a string: ");
        str = in.nextLine();
        System.out.println("Enter a Sub string to be replace: ");
        sub = in.nextLine();
        System.out.println("Enter the replacement String: ");
        repl = in.nextLine();
        str = str.replace(sub,repl);
        System.out.println(str);
    }
}

