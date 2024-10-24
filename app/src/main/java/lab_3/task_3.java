package lab_3;

public class task_3 {
    public static void main() {
        _iFigure[] figures = new _iFigure[3];
        figures[0] = new _iRectangle(4, 5);
        figures[1] = new _iCircle(3);
        figures[2] = new _iTrapezium(3, 5, 4);
        for (_iFigure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimeter: " + figure.getPerimeter());
            System.out.println();
        }
        _iRectangle rect1 = new _iRectangle(4, 5);
        _iRectangle rect2 = new _iRectangle(4, 5);
        System.out.println("rect1 equals rect2: " + rect1.equals(rect2));
    }
}
//  Те саме що й 2 завдання, але інтерфейсами.