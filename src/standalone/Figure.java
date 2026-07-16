package standalone;

interface Figure {
    double getArea();
}

class Circle implements Figure {
    private double radius;

    public Circle(double radius){
        NonNegativeDimensions.validate(radius);

        this.radius = radius;
    }
        
    @Override
    public double getArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }
}

class Rectangle implements Figure {
    protected double sideA;
    protected double sideB;
    
    public Rectangle(double sideA, double sideB) {
        NonNegativeDimensions.validate(sideA);
        NonNegativeDimensions.validate(sideB);

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA*this.sideB;
    }
}

class Square extends Rectangle {
    public Square(double sideLenght) {
        super(sideLenght, sideLenght);
    }
}

class IsoscelesTriangle implements Figure {
    private double base;
    private double height;

    public IsoscelesTriangle(double base, double height){
        NonNegativeDimensions.validate(base);
        NonNegativeDimensions.validate(height);

        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return this.base * this.height / 2;
    }
}


final class NonNegativeDimensions {
    private NonNegativeDimensions() {}

    static void validate(double value) {
        if (!Double.isFinite(value) || value < 0) {
            throw new IllegalArgumentException("Dimension cannot be negative, infinite or NaN.");
        }
    }
}