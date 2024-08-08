public class ClassA {
     int a;
     int b;

    public ClassA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void doA(int multiplier){
         a *= multiplier;
    }

    public static void sayHello() {
        System.out.println("Hi.");
    }

    public int doB(){
        return a + b;

    }
}
