package chapter09.Exercise09;

public class TestPloligon {

	public static void main(String[] args) {
	
		RegularPolygon rP1= new RegularPolygon();
		RegularPolygon rP2= new RegularPolygon(6,4.0);
		RegularPolygon rP3= new RegularPolygon(10, 4, 5.6, 7.8);
		
		
		System.out.println("*************************************");
		System.out.println("*  Object No |  Perimeter  |  Area  *");
		System.out.println("-------------------------------------");
		System.out.printf( "*      1     |    %5.2f    |  %5.2f *\n", 
			rP1.getPerimeter(), rP1.getArea());
		System.out.printf( "*      2     |    %5.2f    |  %5.2f *\n", 
			rP2.getPerimeter(), rP2.getArea());
		System.out.printf( "*      3     |    %5.2f    | %5.2f *\n", 
			rP3.getPerimeter(), rP3.getArea());
		System.out.println("*************************************");;
	}
}
		

	
