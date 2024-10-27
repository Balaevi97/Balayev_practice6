package Task4;

public class Shape {
    public String name;


    public void area () {
        System.out.println("Unknown area");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
    }
}
