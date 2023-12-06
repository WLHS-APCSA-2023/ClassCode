public class Rectangle {
    //properties of a rectangle
    //instance variables - declared but not initialized
    private int width;
    private int height;

    //to create rectangle, we need a constructor
    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }

    public int getArea(){
        return width * height;
    }

    //write getPerimeter()
    public int getPerimeter(){
        return 2*(width + height);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
