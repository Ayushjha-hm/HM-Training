import java.util.Scanner;


class A {

    A(){
        System.out.println("A()");

    }

    A(int a){

        System.out.println("A(int a)");

    }

    A(int a,int b){
        System.out.println("A(int a,int b)");

    }
    A(int a ,int b,int c){
        System.out.println("A(int a, int b,int c)");

    }

}

class demo3{
    public static void main(String args []){
        A a = new A();
        A a1 = new A(100);
    }
}