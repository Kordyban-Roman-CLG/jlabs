package lab_2;

public class task_3 {
    public static void main() {
        _Drib drib1 = new _Drib(1, 2);
        _Drib drib2 = new _Drib(3, 4);

        _Drib sum = drib1.add(drib2);
        _Drib difference = drib1.subtract(drib2);
        _Drib product = drib1.multiply(drib2);
        _Drib quotient = drib1.divide(drib2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}