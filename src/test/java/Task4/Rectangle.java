package Task4;

public class Rectangle extends Shape {
    public int length;
    public int width;

    public Rectangle (int length, int width) {
        super.name = "მართკუთხედის ";
        this.length = length;
        this.width = width;
    }

    public Rectangle (int width) {
        this(width, width);
        super.name = "კვადრატის ";

    }

    public void area () {
//        super.area();

        int area = length * width;
        System.out.println(name + "ფართობია: " + area);

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        Rectangle square = new Rectangle(10);

        rectangle.area();
        square.area();
    }
}
