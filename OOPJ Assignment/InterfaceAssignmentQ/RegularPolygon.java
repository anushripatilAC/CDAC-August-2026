
interface RegularPolygon {

    // Abstract methods
    int getNumSides();

    double getSideLength();

    // Default method for perimeter
    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    // Default method for interior angle
    default double getInteriorAngle() {
        int n = getNumSides();
        return (n - 2) * Math.PI / n;
    }

    // Static method
    static int totalSides(RegularPolygon[] polygons) {
        int total = 0;

        for (RegularPolygon polygon : polygons) {
            total = total + polygon.getNumSides();
        }

        return total;
    }
}


class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}


// Square
class Square implements RegularPolygon {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}

