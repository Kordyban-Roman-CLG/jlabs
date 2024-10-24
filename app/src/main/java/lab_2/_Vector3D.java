package lab_2;

public class _Vector3D {
    private double x;
    private double y;
    private double z;

    public _Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public _Vector3D add(_Vector3D other) {
        return new _Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public _Vector3D subtract(_Vector3D other) {
        return new _Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double dotProduct(_Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public _Vector3D multiplyByScalar(double scalar) {
        return new _Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _Vector3D vector = (_Vector3D) obj;
        return Double.compare(vector.x, x) == 0 &&
                Double.compare(vector.y, y) == 0 &&
                Double.compare(vector.z, z) == 0;
    }

    public int compareLength(_Vector3D other) {
        double thisLength = this.length();
        double otherLength = other.length();
        return Double.compare(thisLength, otherLength);
    }

    @Override
    public String toString() {
        return "Vector3D(" + x + ", " + y + ", " + z + ")";
    }
}