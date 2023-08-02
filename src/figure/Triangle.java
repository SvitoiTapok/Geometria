package figure;

import figure.Figure;

public class Triangle extends Figure {
    double b;
    double c;
    public static int triangleCount;
    {
        triangleCount++;
    }
    public Triangle(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
        sideCount = 3;
    }
    @Override
    public double GetSquare(){
        double p = (side+b+c)/2;
        double s = p*(p-side)*(p-b)*(p-c);
        return (s>=0)?Math.sqrt(s):-1;
    }
    @Override
    public double GetPerimeter(){
        return side+b+c;
    }
}