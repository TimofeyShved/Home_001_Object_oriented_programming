public class Humen {
    int age;
    double mass;

    public static void main(String[] args){
        Humen man1 = new Humen();
        man1.buyBred();
        man1.buyMilk();
        System.out.println("Hello");
    }

    void birthday(){
        age++;
    }

    void buyBred(){
        System.out.println("buy Bred");
    }

    void buyMilk(){
        System.out.println("buy Milk");
    }
}
