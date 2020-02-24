public class Ques10 {
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){ return a+b; }

    float mul(float a,float b){ return a*b; }

    int mul(int a, int b){return a*b; }

    String concat(String a,String b){
        return a+b;
    }

    String concat(String a,String b, String c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Ques10 obj = new Ques10();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1.5,2.6));
        System.out.println(obj.mul(5,6));
        System.out.println(obj.mul(5.5f,4.5f));
        System.out.println(obj.concat("Hello ","World"));
        System.out.println(obj.concat("J","V","M"));
    }
}
