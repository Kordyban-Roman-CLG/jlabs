package lab_2;

public class task_2 {
    public static void main() {
        _ComplexNumber num1 = new _ComplexNumber(4, 3);
        _ComplexNumber num2 = new _ComplexNumber(2, -5);

        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Модуль числа 1: " + num1.modulus());
        System.out.println("Аргумент числа 1: " + num1.argument());
        System.out.println("Додавання: " + num1.add(num2));
        System.out.println("Віднімання: " + num1.subtract(num2));
        System.out.println("Множення: " + num1.multiply(num2));
        System.out.println("Ділення: " + num1.divide(num2));
        System.out.println("Комплексно спряжене число 1: " + num1.conjugate());
    }
}
