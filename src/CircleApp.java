import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the circle checker!");
boolean userContinue = true;
while(userContinue){
System.out.println("Please enter a radius: ");	
	Scanner input = new Scanner(System.in);
	double radius = input.nextDouble();
	Circle c = new Circle(radius);
	System.out.println("Area: "+ c.getFormattedArea());
	System.out.println("Circumfrence: "+c.getFormattedCircumfrence());
	
		//add continue loop
		System.out.println("Continue? (Enter Y or N)");
		Scanner input2 = new Scanner(System.in);
		String inputContinue = input2.nextLine();
		
		// add continue loop
		if(inputContinue.equalsIgnoreCase("y")){
			userContinue = true;
			
		} else {
			//userContinue = false;
			int counter=c.getObjectCount();
			System.out.println("Goodbye. You created "+counter+" Circle object(s)");
		}
	}

	}//main	
	
}//class
