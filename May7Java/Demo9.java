class A {
    static int x = 100;
    static void display(){
        System.out.println("Hi display");
    }

}

class Demo9{
    public static void main(String args[]){
        //A a = new A();
        //a.display();

        System.out.println(A.x);
        A.display();
    }
}