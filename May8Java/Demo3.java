
interface Company {

    void pf();
}

class Manager implements Company{

    
    public void pf() {
        System.out.println("manager pf is 12000");
    }
}

class Developer implements Company{
    
    public void pf(){
        System.out.println("Developer pf is 1400");
    }
}

class Demo3 {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.pf();
        Developer d = new Developer();
        d.pf();
    }
    
}