public class Triangle {
    //Add the fields necessary to create a triangle here.
    //Make use of the Line class

    public Line line1;
    public Line line2;
    public Line line3;

    public Triangle(Line line1,Line line2, Line line3){
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }
    //Implement a method which returns the area of the triangle
    public double area(){
        double s = (line1.length() + line2.length() + line3.length())/2;
        double area = Math.sqrt(s*(s - line1.length()) * (s - line2.length()) * (s - line3.length()));
        System.out.println("The area of the Triangle is :" + area);
        return area;
    }
    //Implement a method which returns the circumreference of the triangle
    public double circumreference(){
        double circumreference = line1.length() + line2.length() +line3.length();
        System.out.println("The circumreference of the Triangle is :" + circumreference);
        return circumreference;
    }
}
