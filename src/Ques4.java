import java.util.Scanner;

// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class Ques4 {
    public static void main(String[] args) {
        String[] constants = {"UpperCase","Lowercase","Digits","SpecialChars"};
        int[] hash = {0,0,0,0};
        Scanner in =  new Scanner(System.in);
        String str = in.nextLine();
        int total;
        for (char c : str.toCharArray()) {
            hash[0] += Character.isUpperCase(c) ? 1:0;
            hash[1] += Character.isLowerCase(c) ? 1:0;
            hash[2] += Character.isDigit(c) ? 1:0;
            if(!Character.isDigit(c) && !Character.isUpperCase(c) && !Character.isLowerCase(c)){
                hash[3] += 1;
            }
        }
        for(int i=0;i<hash.length;i++){
            float percentage = ((float) hash[i]/str.length())*100;
            System.out.println("{" + constants[i]+" => Number: "+hash[i]+", Percentage => "+percentage+"}");
        }

    }
}
