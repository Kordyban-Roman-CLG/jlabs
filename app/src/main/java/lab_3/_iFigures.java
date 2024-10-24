package lab_3;

interface _iFigure {
    double getArea();

    double getPerimeter();

    @Override
    String toString();

    @Override
    boolean equals(Object obj);
}

class _iRectangle implements _iFigure {
    private double width;
    private double height;

    public _iRectangle(double width, double height) {
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
        return "iRectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _iRectangle rectangle = (_iRectangle) obj;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }
}

class _iCircle implements _iFigure {
    private double radius;

    public _iCircle(double radius) {
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
        return "iCircle [radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _iCircle circle = (_iCircle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class _iTrapezium implements _iFigure {
    private double a, b, h;

    public _iTrapezium(double a, double b, double h) {
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
        return "iTrapezium [a=" + a + ", b=" + b + ", h=" + h + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        _iTrapezium trapezium = (_iTrapezium) obj;
        return Double.compare(trapezium.a, a) == 0 &&
                Double.compare(trapezium.b, b) == 0 &&
                Double.compare(trapezium.h, h) == 0;
    }
}
