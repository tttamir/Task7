package Task2;

public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 4, 3);
        Square square = new Square(4);
        Circle circle = new Circle(6);

        triangle.square();
        triangle.perimetr();
        square.square();
        square.perimetr();
        triangle.square();
        triangle.perimetr();
    }
}
