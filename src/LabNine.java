import java.util.Scanner;

public class LabNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean proceed;
System.out.println("Please enter a radius: ");
while(proceed=true){	
	Scanner input = new Scanner(System.in);
	double radius = input.nextDouble();
	myRadius(radius);
	myCircumference(radius);
	}
	}//main
//find Circumference
	public static void myCircumference(double radius) {
		if(radius>0){
			boolean proceed = true;
			System.out.println("Circumference: "+2*Math.PI*radius); 
		}else{
			System.out.println("Please enter a radius: ");	
		}
		
	}
//find radius
	public static void myRadius(double radius) {
			if(radius>0){
				boolean proceed = true;
				System.out.println("Area: "+Math.PI*Math.pow(radius, 2)); 
			}else{
				System.out.println("Please enter a radius: ");	
			}

		
	}

	
	
}//class
