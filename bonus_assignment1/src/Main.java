public class Main
{
        public static void main(String[] args){
		//Create a square using the Point, Line, and Square classes
		//Print the area and circumreference of the square
		//Print using the "System.out.println()" command

            Point point1 = new Point(1,7);
            Point point2 = new Point(4,7);
            Point point3 = new Point(4,2);
            Point point4 = new Point(1,2);

            Line line1 = new Line(point1,point2);
            Line line2 = new Line(point2,point3);
            Line line3 = new Line(point3,point4);
            Line line4 = new Line(point4,point1);

            // Finding the area and circumreference of a Rectangle
            Rectangle rect = new Rectangle(line1,line2,line3,line4);
            rect.area();
            rect.circumreference();



            Point p1 = new Point(1,7);
            Point p2 = new Point(4,7);
            Point p3 = new Point(4,2);

            Line l1 = new Line(p1,p2);
            Line l2 = new Line(p2,p3);
            Line l3 = new Line(p3,p1);

            // Finding the area and circumreference to console of a Triangle

            Triangle tri = new Triangle(l1,l2,l3);
            tri.area();
            tri.circumreference();

        }
}
