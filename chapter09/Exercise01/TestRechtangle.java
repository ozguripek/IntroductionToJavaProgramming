package chapter09.Exercise01;

public class TestRechtangle {

	public static void main(String[] args) {
		Rechtangle rechtangle1= new Rechtangle(4,40);
		Rechtangle rechtangle2= new Rechtangle(3.5, 35.9);
		
		System.out.println( "Rechtangle 1: "
				+ "\nwidth: " + rechtangle1.width + 
				  "\nheight: " + rechtangle1.height + 
				  "\narea: " +rechtangle1.getArea() + 
				  "\nperimeter: " + rechtangle1.getPerimeter()+
				  "\n*****************************");
		System.out.println( "Rechtangle 2: "
				+ "\nwidth: " + rechtangle2.width + 
				  "\nheight: " + rechtangle2.height + 
				  "\narea: " +rechtangle2.getArea() + 
				  "\nperimeter: " + rechtangle2.getPerimeter());

	}

}
