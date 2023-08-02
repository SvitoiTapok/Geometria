package figure.quadrileteral;

import figure.Quadrilateral;

public class Parallelogram extends Quadrilateral {
    double side;
    double b;
    int sideCount = 4;
    Parallelogram(double a, double b){
        super(a,b,a,b);
        this.side = a;
        this.b = b;
    }
}
