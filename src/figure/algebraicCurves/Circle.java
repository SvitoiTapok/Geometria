package figure.algebraicCurves;

import figure.AlgebraicCurves;

public class Circle extends AlgebraicCurves {
    double radius;
    public Circle(double a){
        super(a);
        this.radius = a;
    }

    @Override
    public double GetPerimeter() {
        return PI*radius*2;
    }
    @Override
    public double GetSquare(){
        return PI*Math.pow(radius,2);
    }
}
