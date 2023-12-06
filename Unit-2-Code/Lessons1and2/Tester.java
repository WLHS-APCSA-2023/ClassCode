public class Tester {
    public static void main(String[] args) {
        //Type name = new Contructor()
        Rectangle myRectangle = new Rectangle(5,6);
        int myRectangleArea = myRectangle.getArea();
        int myRectanglePerimeter = myRectangle.getPerimeter();
        System.out.println("Area: " + myRectangleArea);
        System.out.println("Perimeter: " + myRectanglePerimeter);

        //Make a new rectangle with a width of 12 and height of 10
        Rectangle newRect = new Rectangle(12,10);
        int newPerimeter = newRect.getPerimeter();
        int newArea = newRect.getArea();
        System.out.println("Area: " + newArea);
        System.out.println("Perimeter: " + newPerimeter);
    }
}
