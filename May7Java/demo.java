class P {

	int money  = 200000;
	String car  = "BMW";
	int site = 5;
	private String newcar  = "Benz";

	

}

class C extends P {
	
	int money = 2000;
	void use(){

		System.out.println("Money: "+ money);
			
		System.out.println("Parent Money: "+ super.money);
		System.out.println("Car : "+ car);
	
		System.out.println("SITE : "+ site);
		//System.out.println("New Car: "+ newcar);
		

	}
	
	
}

class demo{

public static void main(String args[]){

	C c  = new C();
	c.use();

	}

}
