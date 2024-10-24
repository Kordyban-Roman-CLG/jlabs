package lab_3;

public class task_2 {
    public static void main() {
        _Figure[] figures = new _Figure[3];
        figures[0] = new _Rectangle(4, 5);
        figures[1] = new _Circle(3);
        figures[2] = new _Trapezium(3, 5, 4);
        for (_Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimeter: " + figure.getPerimeter());
            System.out.println();
        }
        _Rectangle rect1 = new _Rectangle(4, 5);
        _Rectangle rect2 = new _Rectangle(4, 5);
        System.out.println("rect1 equals rect2: " + rect1.equals(rect2));
    }
}
/*
    Реалізувати абстрактний базовий клас з вказаними абстрактними методами.
    Створити підкласи(похідні класи) суперкласу( базового класу), в яких здійснити реалізацію всіх абстрактних методів.
    Самостійно визначити, які поля необхідні і які з них визначити в базовому класі, а які – в похідних.
    В похідних класах мають бути перевантажені методи toString та equal. Створити масив об’єктів.
    Проілюструвати роботу всіх методів підкласів(похідних класів).

    Створити абстрактний базовий клас Figure з абстрактними методами обчислення площі і периметру.
    Створити похідні класи:
        Rectangle (прямокутник),
        Circle (коло),
        Trapezium (трапеція)
    зі своїми функціями для обчислення площі і периметра.
*/