
public class TestCircle {

	public static void main(String[] args) {
		// Declare an instance of Circle class called c1.
		// Construct the instance c1 by invoking the "default" constructor
		// which sets its radius and color to their default value.
		Circle c1 = new Circle();
		// invoke public methods on instance c1, via dot operator.
		System.out.println("The circle has radius of " + c1.getRadius() +
				" and area of " + c1.getArea());
		// the circle has radius of 1.0 and area of 3.14

		// Declare an instance of class circle called c2.
		// Construct the instance c2 by invoking the second constructor
		// with the given radius and default color.
		Circle c2 = new Circle(2.0);
		// invoke public methods on instance c2, via dot operator
		System.out.println("the circle has radius of " + c2.getRadius()
		+ " and area of " + c2.getArea());
		
		Circle c3 = new Circle();
		c3.setRadius(4.4);
		System.out.println("\nradius is " + c3.getRadius());
		c3.setColor("green");
		System.out.println("color is: " + c3.getColor());
		
		Circle c4 = new Circle();
		c4.setRadius(8.9);
		System.out.println("\nRad is " + c4.getRadius());
		c4.setColor("blue");
		System.out.println("color is " + c4.getColor());
		
		Circle c5 = new Circle();
		c5.setRadius(15.5);
		System.out.println("\nradiuss is " + c5.getRadius());
		c5.setColor("Garish Blue");
		System.out.println("the colour is " + c5.getColor());
		
		Circle c6 = new Circle();
		System.out.println(c6.toString());
		
		Circle c7 = new Circle();
		System.out.println(c7.toString());
		System.out.println(c7);
		System.out.println("Operator '+' invokes toString() too: " + c7);
	
	}
	
	
	}


