import java.util.Scanner;

public class Ques7 {
    static String Firstname = "Ankit";
    static String Lastname = "Kumar";
    static int age = 21;

    static{
        System.out.println("Using Static Block " + Firstname + " " + Lastname + " " + age);
    }

    static void printUsingStatic(){
        System.out.println("Using Static Method " + Firstname + " " + Lastname + " " + age);
    }

    public static void main(String[] args) {
        System.out.println("Using Static Variable " + Firstname + " " + Lastname + " " + age);
        printUsingStatic();
    }
}
