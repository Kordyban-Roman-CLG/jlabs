package lab_3;

abstract class _Figure {
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);
}

class _Rectangle extends _Figure {
    private double width;
    private double height;

    public _Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _Rectangle rectangle = (_Rectangle) obj;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }
}

class _Circle extends _Figure {
    private double radius;

    public _Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _Circle circle = (_Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class _Trapezium extends _Figure {
    private double a, b, h;

    public _Trapezium(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return ((a + b) / 2) * h;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow((a - b) / 2, 2) + Math.pow(h, 2));
        return a + b + 2 * side;
    }

    @Override
    public String toString() {
        return "Trapezium [a=" + a + ", b=" + b + ", h=" + h + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _Trapezium trapezium = (_Trapezium) obj;
        return Double.compare(trapezium.a, a) == 0 &&
                Double.compare(trapezium.b, b) == 0 &&
                Double.compare(trapezium.h, h) == 0;
    }
}