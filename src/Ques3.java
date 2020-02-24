import java.util.Scanner;

// Write a program to find the number of occurrences of a character in a string without using loop?
public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch = in.next().charAt(0);
        Ques3 ques3Obj = new Ques3();
        System.out.println(ques3Obj.occurrance(ch,str,0,0));
    }

    int occurrance(char ch,String str,int idx,int count){
        if(idx==str.length()){
            return count;
        } else{
            count += str.charAt(idx) == ch ? 1 : 0;
            return occurrance(ch,str,idx+1,count);
        }
    }
}
