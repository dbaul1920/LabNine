import java.math.BigDecimal;

public class Circle {

	public double radius;	
	public double circumfrence;
	public double area;
	
//constructor
	public Circle(double radius){
		double r = radius;
		
		
	}
	
//radius	
	public  double getRadius(){
		return radius;
	}
	public void setRadius(double r) {

	}	
//Circumference	
	public  double getCircumfrence(){
			
			double circumfrence=2*Math.PI*radius;
			return circumfrence;
	}
	public void setCircumfrence(double c) {

	}		
//Area	
	public  double getArea(){
		double area=Math.PI*Math.pow(radius, 2);	
		return area;
	}
		public void setArea(double area) {

	}		
/////Formated Results///////	

//Formated Area
		public  String getFormattedArea(){
			return null;
			
		}
		
//Formated Circumference	
			public String getFormattedCircumfrence() {
			String formatNum=String.format("%10.2f%n",getFormattedCircumfrence());
			return formatNum;
		}	
			
//Object Count
		public  String getObjectCount(){
			return null;
			jhglygiuhjoij
		}

	



}
