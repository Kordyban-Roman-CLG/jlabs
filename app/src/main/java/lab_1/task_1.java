package lab_1;

import java.util.Scanner;

public class task_1 {
    static double func(double a, double b) {
        return a + (a + b - 1) / (a * a + 2) - Math.pow(a * b, 3);
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.printf("a:");
        double a = input.nextDouble();
        System.out.printf("b:");
        double b = input.nextDouble();
        System.out.println(task_1.func(a, b));
        input.close();
    }
}
// a + (a + b - 1) / (a ^ 2 + 2) - (a * b) ^ 3