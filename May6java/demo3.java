import java.util.Scanner;

class A{
		
	int id;
	String name;
	
	A(){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter name: ");
	name = sc.nextLine();

	System.out.println("Enter the id: ");
	id = sc.nextInt();
	
	
	}

	void display(){
	
	System.out.println("Hi my name  is : " + name);
	System.out.println("My id  is : " + id);

	
	}
	


}

class demo3 {	

	public static void main(String args[]){

		A a = new A();
		a.display();		

	}

}

