
class Bank{

    public void roi(){
        System.out.println("rate of interest is 10%");
    }


}

class SBI extends Bank{

}

class Axis extends Bank{
    public void roi(){
        System.out.println("rate of interest of axis is 12%");

    }
}


class Demo4{
    public static void main(String args[]){
        SBI s = new SBI();
        s.roi();

        Axis a = new Axis();
        a.roi(); 
    }
}