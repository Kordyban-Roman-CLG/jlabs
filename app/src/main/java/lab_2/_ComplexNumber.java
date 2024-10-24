package lab_2;

public class _ComplexNumber {
    private double real;
    private double imag;

    public _ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public double modulus() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public _ComplexNumber add(_ComplexNumber other) {
        return new _ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    public _ComplexNumber subtract(_ComplexNumber other) {
        return new _ComplexNumber(this.real - other.real, this.imag - other.imag);
    }

    public _ComplexNumber multiply(_ComplexNumber other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new _ComplexNumber(realPart, imagPart);
    }

    public _ComplexNumber divide(_ComplexNumber other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double realPart = (this.real * other.real + this.imag * other.imag) / denominator;
        double imagPart = (this.imag * other.real - this.real * other.imag) / denominator;
        return new _ComplexNumber(realPart, imagPart);
    }

    public _ComplexNumber conjugate() {
        return new _ComplexNumber(real, -imag);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}