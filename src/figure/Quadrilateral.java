package figure;

import figure.Figure;

public class Quadrilateral extends Figure {
    double b;double c;double d;
    public static int quadrlateralCount;
    {
        quadrlateralCount++;
    }
    public Quadrilateral(double a, double b, double c, double d){
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.sideCount = 4;
    }
    @Override
    public double GetPerimeter(){
        return this.side + d + b+c;
    }
    
}
