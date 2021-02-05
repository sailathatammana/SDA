public class Rectangle{
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class
	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;


	//private double width;
	//private double length;

	//Create a constructor which recieves and stores 4 lines when created
	public Rectangle(Line l1, Line l2, Line l3, Line l4){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;

	}

	//Implement a method which returns the circumreference of the rectangle
	public double circumreference(){
		double circumreference = l1.length()+ l2.length() +l3.length() +l4.length();
		System.out.println("The circumreference of the Rectangle is :" + circumreference);
		return circumreference;
	}	

	//Implement a method which returns the area of the rectangle
	public double area(){
		double totarea = l1.length() * l2.length();
		System.out.println("The area of the Rectangle is :" + totarea);
		return totarea;
	}
}