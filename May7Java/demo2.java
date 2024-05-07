import java.util.Scanner;

class Emp{

    int id,age;
    String name;

    Emp(){

        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter ID : ");
	    id  = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter name: ");
	    name = sc.nextLine();
	    System.out.println("Enter age : ");
	    age = sc.nextInt();
    }

}

class Manager extends Emp{

	
	int salary=80000;
	String design = "Manager";
	

	Manager(){

	}
	
	void display(){
	
	System.out.println("My name is : " + name );
	System.out.println("My Id is : " + id);
	System.out.println("My age is : "+ age);
	System.out.println("My salary is : "+ salary);
	System.out.println("My designation is : "+ design);

	
	}
	

}

class Dev extends Emp{

	
	int salary=60000;
	String design = "Developer";
	

	Dev(){

	}
	
	void display(){
	
	System.out.println("My name is : " + name );
	System.out.println("My Id is : " + id);
	System.out.println("My age is : "+ age);
	System.out.println("My salary is : "+ salary);
	System.out.println("My designation is : "+ design);

	
	}
	

}


class Clerk extends Emp{

	int salary=20000;
	String design = "Clerk";
	

	Clerk(){

	}
	
	void display(){
	
	System.out.println("My name is : " + name );
	System.out.println("My Id is : " + id);
	System.out.println("My age is : "+ age);
	System.out.println("My salary is : "+ salary);
	System.out.println("My designation is : "+ design);

	
	}
	

}



class demo2{
	
	public static void main(String args[]){
		
		Scanner sc  = new Scanner(System.in);
		int choice = 0;
			
		System.out.println("Press 1 for Developer: ");				
	
		System.out.println("Press 2 for Clerk: ");				
	
		System.out.println("Press 3 for Manager: ");	

        System.out.println("Press 4 for exit: ");			
		do{
			
		System.out.println("Enter a choice");
		choice = sc.nextInt();
		if(choice==1){
			Dev d = new Dev();
			d.display();
		}

		if(choice==2){
			Clerk c = new Clerk();
			c.display();

		}

        if(choice==3){
            Manager m = new Manager();
            m.display();
        }

		if(choice==4){
            System.out.println("Thank you Bye!!");
			System.exit(0);
		}
			

		}while(choice!=3);
	
		
	}

}