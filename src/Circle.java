import java.math.BigDecimal;

public class Circle {

	public double radius;	
	public double circumfrence;
	public double area;
	
//constructor
	public Circle(double r){
		radius = r;
		
		
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
	public void setCircumfrence(double r) {

	}		
//Area	
	public  double getArea(){
		double area=Math.PI*Math.pow(radius, 2);	
		return area;
	}
		public void setArea(double r) {

	}		
/////Formated Results///////	

//Formated Area
		public  String getFormattedArea(){
			String formatNum=String.format("%10.2f%n" ,getArea());
			return formatNum;
			
		}
		
//Formated Circumference	
			public String getFormattedCircumfrence() {
			String formatNum=String.format("%10.2f%n",getCircumfrence());
			return formatNum;
		}	
			
//Object Count
		public  String getObjectCount(){
			return null;
			
		}

	



}
