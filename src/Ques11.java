public class Ques11 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();
        bank.getDetails();
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}


class Bank {
    void getDetails(){
        System.out.println("Rate of Intrest: 7%");
    }
}

class SBI extends  Bank{
    void getDetails(){
        System.out.println("SBI Rate of Intrest: 8%");
    }
}

class BOI extends  Bank{
    void getDetails(){
        System.out.println("BOI Rate of Intrest: 9%");
    }
}

class ICICI extends  Bank{
    void getDetails(){
        System.out.println("ICICI Rate of Intrest: 10%");
    }
}

