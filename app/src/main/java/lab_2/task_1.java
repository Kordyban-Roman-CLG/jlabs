package lab_2;

public class task_1 {
    public static void main() {
        _Vector3D v1 = new _Vector3D(1, 2, 3);
        _Vector3D v2 = new _Vector3D(4, 5, 6);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v1 + v2 = " + v1.add(v2));
        System.out.println("v1 - v2 = " + v1.subtract(v2));
        System.out.println("v1 . v2 = " + v1.dotProduct(v2));
        System.out.println("v1 * 2 = " + v1.multiplyByScalar(2));
        System.out.println("Довжина v1 = " + v1.length());
        System.out.println("Порівняння довжин v1 і v2: " + v1.compareLength(v2));
        System.out.println("v1 дорівнює v2? " + v1.equals(v2));
    }
}