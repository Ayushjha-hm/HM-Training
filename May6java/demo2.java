import java.util.Scanner;

class A{
	
	A(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = sc.nextLine();

		System.out.println("Enter ID");
		int id = sc.nextInt();

		System.out.println("Enter Age");
		int age = sc.nextInt();

		System.out.println("Enter salary");
		float salary = sc.nextFloat();


		System.out.println("My name is " +name);
		System.out.println("My ID is  "+ id);
		System.out.println("my age is "+ age);
		System.out.println("My salary is "+ salary);

		}

	}

	public class demo2 {

	public static void main(String args[]){

	A a = new A();

		}	
	}
