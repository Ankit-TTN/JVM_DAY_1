import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        for(int i=0;i<strArray.length; i++) {
            int count = 1;
            if(strArray[i]!="") {
                for (int j = i + 1; j < strArray.length; j++) {
                    if (strArray[i].equals(strArray[j])) {
                        strArray[j] = "";
                        count++;
                    }
                }
                System.out.println(strArray[i]+" : "+count);
            }
        }
    }
}
