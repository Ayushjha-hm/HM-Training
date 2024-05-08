
final class A{
    int site = 5;
    int money = 3000;
    String car = "benz";
    final int speed = 30;

    final void gear(){
        System.out.println("6");
    }

}

// class B extends A {
//     void gear(){
//         System.out.println("5");
//     }
// }



public class Demo1 {

    public static void main(String[] args) {
        A a = new A();
       // B b =  new B();
       // System.out.println(b.speed);
        //b.speed = 2000; bcz its final

        System.out.println(a.speed);
        a.gear();
    }
    
}