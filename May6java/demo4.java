import java.util.Scanner;

class Dev{

	int id,age;
	int salary=60000;
	String name;
	String design = "Developer";
	

	Dev(){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ID : ");
	id  = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter name: ");
	name = sc.nextLine();
	System.out.println("Enter age : ");
	age = sc.nextInt();

	
	

	}
	
	void display(){
	
	System.out.println("My name is : " + name );
	System.out.println("My Id is : " + id);
	System.out.println("My age is : "+ age);
	System.out.println("My salary is : "+ salary);
	System.out.println("My designation is : "+ design);

	
	}
	

}


class Clerk{

	int id,age;
	int salary=20000;
	String name;
	String design = "Clerk";
	

	Clerk(){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ID : ");
	id  = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter name: ");
	name = sc.nextLine();
	System.out.println("Enter age : ");
	age = sc.nextInt();

	
	

	}
	
	void display(){
	
	System.out.println("My name is : " + name );
	System.out.println("My Id is : " + id);
	System.out.println("My age is : "+ age);
	System.out.println("My salary is : "+ salary);
	System.out.println("My designation is : "+ design);

	
	}
	

}



class demo4{
	
	public static void main(String args[]){
		
		Scanner sc  = new Scanner(System.in);
		int choice = 0;
			
		System.out.println("Press 1 for Developer: ");				
	
		System.out.println("Press 2 for Clerk: ");				
	
		System.out.println("Press 3 for Exit: ");				
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
			System.exit(0);
		}
			

		}while(choice!=3);
	
		
	}

}
