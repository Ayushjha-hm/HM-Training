abstract class Bank {
    abstract void ATM();
    abstract void KYC();

}

class SBI extends Bank {

    void ATM(){
        System.out.println("50000");

    }

    void KYC(){
        System.out.println(" SBI KYC");
    }
}

class Axis extends Bank{
    void ATM(){
        System.out.println("25000");

    }

    void KYC(){
        System.out.println("Axis KYC");
    } 
}

class Demo10{

    public static void main(String args[]){
        SBI s  = new SBI();
        s.ATM();
        s.KYC();

        Axis a = new Axis();
        a.ATM();
        a.KYC();
    }

}