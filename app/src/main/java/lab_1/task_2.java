package lab_1;

public class task_2 {
    public static void processArray(double[] X, double a, double b) {
        if (a >= b) {
            System.out.println("Error: 'a' must be less than 'b'");
            return;
        }
        if (X == null || X.length == 0) {
            System.out.println("Error: Array is empty or null");
            return;
        }
        if (X.length > 200) {
            System.out.println("Error: Array length exceeds 200");
            return;
        }
        double sumLessThanA = 0;
        double productGreaterThanB = 1;
        boolean hasProductElements = false;
        double maxInRange = Double.NEGATIVE_INFINITY;
        double minInRange = Double.POSITIVE_INFINITY;
        boolean hasRangeElements = false;
        for (int i = 0; i < X.length; i++) {
            if (X[i] < a) {
                sumLessThanA += X[i];
            }
            if (X[i] > b) {
                productGreaterThanB *= X[i];
                hasProductElements = true;
            }
            if (X[i] >= a && X[i] <= b) {
                maxInRange = Math.max(maxInRange, X[i]);
                minInRange = Math.min(minInRange, X[i]);
                hasRangeElements = true;
            }
        }
        System.out.println("Sum of elements less than " + a + ": " + sumLessThanA);
        if (hasProductElements) {
            System.out.println("Product of elements greater than " + b + ": " + productGreaterThanB);
        } else {
            System.out.println("No elements greater than " + b + " found");
        }
        if (hasRangeElements) {
            System.out.println("Max in [" + a + "," + b + "]: " + maxInRange);
            System.out.println("Min in [" + a + "," + b + "]: " + minInRange);
        } else {
            System.out.println("No elements found in range [" + a + "," + b + "]");
        }
    }

    public static void main() {
        double[] X = { 1.5, 4.2, 2.8, 7.1, 3.3, 0.5, 8.9, 2.1 };
        double a = 2.0;
        double b = 7.0;
        processArray(X, a, b);
    }
}
/*
    Задано дійсні величини a,b (a<b) і масив чисел X(n), n<=200.
    Розробити програму,
    яка обчислює суму всіх X(i)<a,
    добуток всіх X(i)>b,
    знаходить max X(i) та min X(i) серед X(i) ∈ [a,b], i=1,2,...,n.
*/