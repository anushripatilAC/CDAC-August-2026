
public class Main {

    public static void main(String[] args) {

        EquilateralTriangle triangle =
                new EquilateralTriangle(5);

        Square square =
                new Square(10);

        System.out.println("Triangle sides: "
                + triangle.getNumSides());

        System.out.println("Triangle side length: "
                + triangle.getSideLength());

        System.out.println("Triangle perimeter: "
                + triangle.getPerimeter());

        System.out.println("Triangle interior angle: "
                + triangle.getInteriorAngle());


        System.out.println();


        System.out.println("Square sides: "
                + square.getNumSides());

        System.out.println("Square side length: "
                + square.getSideLength());

        System.out.println("Square perimeter: "
                + square.getPerimeter());

        System.out.println("Square interior angle: "
                + square.getInteriorAngle());


        // Array of RegularPolygon
        RegularPolygon[] polygons = {
                triangle,
                square
        };

        System.out.println();

        System.out.println("Total sides: "
                + RegularPolygon.totalSides(polygons));
    }
}