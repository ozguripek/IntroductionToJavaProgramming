package chapter09.Exercise01;

public class Rechtangle {
	
	double width=1;
	double height=1;
	
	Rechtangle(){
		
	}
	
	Rechtangle(double w, double h){
		 width= w;
		 height= h;
		
	}
	
	 double getArea() {
		
		return width * height;
	 } 
	 
	 double getPerimeter() {
		 
		 return (width + height) * 2;
	 }

}