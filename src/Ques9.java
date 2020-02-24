
class Ques9 {
    enum House {
        H1(100000000),H2(200000000),H3(400000000);

        private int value;
        House(int value){
            this.value = value;
        }

        int getPrice(){
            return this.value;
        }
    }

    public static void main(String[] args) {
        for (House value : House.values()) {
            System.out.println(value.getPrice());
        }
    }
}
