import figure.*;
import figure.algebraicCurves.Circle;
import figure.quadrileteral.Rectangle;
import figure.quadrileteral.Square;
import figure.triangle.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = 4;
        double c = 5;
        double d = 6;
        Triangle acuteAngleTriangle = new Triangle(a, b, c);
        System.out.println(acuteAngleTriangle.GetPerimeter());
        System.out.println(acuteAngleTriangle.GetSquare());
        IsoscelesTriangle RBTriangle = new IsoscelesTriangle(a, b);
        System.out.println(RBTriangle.GetPerimeter());
        System.out.println(RBTriangle.GetSquare());
        RSTriangle rstriangle = new RSTriangle(a);
        System.out.println(rstriangle.GetPerimeter());
        System.out.println(rstriangle.GetSquare());
        Quadrilateral anyQuadrilateral = new Quadrilateral(a,b,c,d);
        Rectangle rectangle = new Rectangle(a,b);
        Square square = new Square(a);
        Circle circle = new Circle(a);
        System.out.println(rectangle.GetPerimeter());
        System.out.println(anyQuadrilateral.GetPerimeter());
        System.out.println(square.GetSquare());
        System.out.println(circle.GetPerimeter());
        System.out.println(circle.GetSquare());
        System.out.println(Figure.count +" "+Triangle.triangleCount+ " " + Quadrilateral.quadrlateralCount);
    }
}